/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

/**
 * Datos del repartidor
 * @author Emmanuel Riveros
 */
public class Repartidor {

    // Nombre del repartidor
    private String nombre;
    // ID para identificar al repartidor
    private String ID;
    // Celular del repartidor
    private String celular;
    
    /**
     * @return nombre del repartidor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre del repartidor a declarar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return ID para identificar al repartidor
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID ID para identificar al repartidor a declarar
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return celular del repartidor
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular celular del repartidor a declarar
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
