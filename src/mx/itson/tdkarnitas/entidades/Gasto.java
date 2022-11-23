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
     * @return fecha donde se realizo el gasto
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha fecha donde se realizo el gasto a declarar
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return descripcion del gasto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion descripcion del gasto a declarar
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return gasto total
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo gasto total a declarar
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
