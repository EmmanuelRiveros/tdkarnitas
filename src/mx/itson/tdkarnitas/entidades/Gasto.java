/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

/**
 * Gastos que se realizaron en el local
 * @author Emmanuel Riveros
 */
public class Gasto {
    
    // Fecha del movimiento
    private String fecha;
    // Descripción del movimiento
    private String descripcion;
    // Costo del movimiento
    private float costo;

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
