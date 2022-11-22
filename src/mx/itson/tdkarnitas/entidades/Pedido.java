/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

import java.util.List;
import mx.itson.tdkarnitas.enumeradores.TipoPago;

/**
 * Guarda los datos de un pedido realizado
 * @author Emmanuel Riveros
 */
public class Pedido {

    // Fecha del pedido
    private String fecha;
    // Numero para identificar el pedido
    private int numero;
    // Cliente que realizo el pedido
    private Cliente cliente;
    // Repartidor que entrego el pedido
    private Repartidor repartidor;
    // Ordenes que se manejaron en el pedido
    private List<Orden> ordenes;
    // Tipo de pago del pedido
    private TipoPago tipo;
    
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the repartidor
     */
    public Repartidor getRepartidor() {
        return repartidor;
    }

    /**
     * @param repartidor the repartidor to set
     */
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    /**
     * @return the ordenes
     */
    public List<Orden> getOrdenes() {
        return ordenes;
    }

    /**
     * @param ordenes the ordenes to set
     */
    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
    
    /**
     * @return the tipo
     */
    public TipoPago getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }
 
}
