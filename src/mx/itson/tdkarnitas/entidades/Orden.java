/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

/**
 * Detalles de la orden
 * @author Emmanuel Riveros
 */
public class Orden {
    
    // Descripción de la orden
    private String descripcion;
    // Cantidad de la orden
    private int cantidad;
    // Costo por cada orden
    private float costo;

    /**
     * @return descripción de la orden
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion decripción de la orden a declarar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return cantidad de la orden
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad cantidad de la orden a declarar
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return costo de la orden
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo costo de la orden a declarar
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
}
