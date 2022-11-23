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
     * @return fecha donde se realizo el pedido
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha fecha donde se realizo el pedido a declarar
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return numero del pedido para identificar
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero numero del pedido para identificar a declarar
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return cliente que realizo el pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente cliente que realizo el pedido a declarar
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return repartidor que entrego el pedido
     */
    public Repartidor getRepartidor() {
        return repartidor;
    }

    /**
     * @param repartidor repartidor que entrego el pedido a declarar
     */
    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    /**
     * @return ordenes que se realizaron en el pedido
     */
    public List<Orden> getOrdenes() {
        return ordenes;
    }

    /**
     * @param ordenes ordenes que se realizaron en el pedido a declarar
     */
    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
    
    /**
     * @return tipo de pago que se manejo en el pedido
     */
    public TipoPago getTipo() {
        return tipo;
    }

    /**
     * @param tipo tipo de pago que se manejo en el pedido a declarar
     */
    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }
 
}
