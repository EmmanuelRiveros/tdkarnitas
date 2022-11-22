/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.negocio;

import mx.itson.tdkarnitas.entidades.Resumen;
import mx.itson.tdkarnitas.entidades.Gasto;
import mx.itson.tdkarnitas.entidades.Pedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Todas las operaciones utilizadas para interpretar los datos del resumen
 * @author Emmanuel Riveros
 */
public class Operacion {
    /**
     * Ordena las fechas de menor a mayor para tener un mejor orden de los pedidos
     * @param resumen Resumen en formato Json ya deserializado
     */
    public static void ordenarFechas(Resumen resumen){
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            
            // Metodo de ordenamiento por selección
            for (int i = 0; i < resumen.getGastos().size()-1; i++){
                
                // El indice de la fecha menor encontrada hasta el momento
                int min_indice = i;
                for (int j = i+1; j < resumen.getGastos().size(); j++){
                    Date fechaJ = formato.parse(resumen.getGastos().get(j).getFecha());
                    Date fechaMin = formato.parse(resumen.getGastos().get(min_indice).getFecha());
                    // Si la fecha es antes de la fecha mínima entonces el indice cambia a esta fecha
                    if (fechaJ.before(fechaMin)) 
                        min_indice = j;
                }
                
                // Variable temporal creada para que no se pierda el valor al momento de intercambiar fechas
                Gasto temp = resumen.getGastos().get(min_indice);
                //Intercambio de fechas
                resumen.getGastos().set(min_indice, resumen.getGastos().get(i));
                resumen.getGastos().set(i, temp);       
            }
            
            // Metodo de ordenamiento por selección
            for (int i = 0; i < resumen.getPedidos().size()-1; i++){
                
                // El indice de la fecha menor encontrada hasta el momento
                int min_indice = i;
                for (int j = i+1; j < resumen.getPedidos().size(); j++){
                    Date fechaJ = formato.parse(resumen.getPedidos().get(j).getFecha());
                    Date fechaMin = formato.parse(resumen.getPedidos().get(min_indice).getFecha());
                    // Si la fecha es antes de la fecha mínima entonces el indice cambia a esta fecha
                    if (fechaJ.before(fechaMin)) 
                        min_indice = j;
                }
                
                // Variable temporal creada para que no se pierda el valor al momento de intercambiar fechas
                Pedido temp = resumen.getPedidos().get(min_indice);
                //Intercambio de fechas
                resumen.getPedidos().set(min_indice, resumen.getPedidos().get(i));
                resumen.getPedidos().set(i, temp);       
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    /**
     * Remueve los meses que no son seleccionados de la informacion proporcionada en el resumen
     * @param resumen Resumen en formato Json ya deserializado
     * @param mes El mes seleccionado 
     */
    public static void calcularMes(Resumen resumen, String mes){
        try{
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            
            // Cambia el mes elegido por un formato númerico
            switch(mes){
            case "Enero": mes = "01"; break;
             case "Febrero": mes = "02"; break;
             case "Marzo": mes = "03"; break;
             case "Abril": mes = "04"; break;
             case "Mayo": mes = "05"; break;
             case "Junio": mes = "06"; break;
             case "Julio": mes = "07"; break;
             case "Agosto": mes = "08"; break;
             case "Septiembre": mes = "09"; break;
             case "Octubre": mes = "10"; break;
             case "Noviembre": mes = "11"; break;
             case "Diciembre": mes = "12"; break;
            }
            
            // Crea una variable que es la fecha mínima
            Date fechaMin = formato.parse("2022-" + mes + "-01");
            
            // Variable que utiliza la clase calendar para sumar un mes a la fecha
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaMin);
            cal.add(Calendar.MONTH, 1);
            
            // Crea una variable que es la fecha máxima
            Date fechaMax = cal.getTime();
            
            // Bucle creado para analizar cada fecha ingresada
            for (int i = 0; i < resumen.getPedidos().size(); i++){
                // Si la fecha es menor que fecha minima, mayor o igual a la fecha máxima se eliminara de la lista de movimientos
                if (formato.parse(resumen.getPedidos().get(i).getFecha()).before(fechaMin) || formato.parse(resumen.getPedidos().get(i).getFecha()).after(fechaMax) || formato.parse(resumen.getPedidos().get(i).getFecha()).equals(fechaMax)){
                    resumen.getPedidos().remove(i);
                    i--;
                }
            }
            for (int i = 0; i < resumen.getGastos().size(); i++){
                // Si la fecha es menor que fecha minima, mayor o igual a la fecha máxima se eliminara de la lista de movimientos
                if (formato.parse(resumen.getGastos().get(i).getFecha()).before(fechaMin) || formato.parse(resumen.getGastos().get(i).getFecha()).after(fechaMax) || formato.parse(resumen.getGastos().get(i).getFecha()).equals(fechaMax)){
                    resumen.getGastos().remove(i);
                    i--;
                }
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Suma todos los gastos del resumen
     * @param gasto Gasto realizado
     * @return El total de todos los gastos
     */
    public static float sumarGastos(List<Gasto> gasto){
        float total = 0;
        for (int i = 0; i < gasto.size(); i++)
            total = total + gasto.get(i).getCosto();
        return total;
    }
    
    /**
     * Suma todos los pedidos e ingresos del resumen
     * @param pedido Pedido realizado
     * @return El total de ingresos de todos los pedidos
     */
    public static float sumarPedidos(List<Pedido> pedido){
        float total = 0;
        for (int i = 0; i < pedido.size(); i++)
            for (int j = 0; j < pedido.get(i).getOrdenes().size(); j++)
                // Suma a la variable total el subtotal de la orden seleccionada "j"
                total = total + (pedido.get(i).getOrdenes().get(j).getCosto()*pedido.get(i).getOrdenes().get(j).getCantidad());
        return total;
    }
    
}
