/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

import com.google.gson.Gson;
import java.util.List;
/**
 * Guarda todos los pedidos y gastos que se realizaron, cuenta con un metodo para deserializar Json
 * @author Emmanuel Riveros
 */
public class Resumen {
    
    // Lista de pedidos que se realizaron
    private List<Pedido> pedidos;
    // Lista de gastos que se realizaron
    private List<Gasto> gastos;

    public Resumen deserializar(String json){
        Resumen edoCuenta = new Resumen();
        try {
            edoCuenta = new Gson().fromJson(json, Resumen.class);
        } catch(Exception ex){
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
        return edoCuenta;
    }
    
    /**
     * @return lista de pedidos
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos lista de pedidos a declarar
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * @return lista de gastos
     */
    public List<Gasto> getGastos() {
        return gastos;
    }

    /**
     * @param gastos lista de gastos a declarar
     */
    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

}
