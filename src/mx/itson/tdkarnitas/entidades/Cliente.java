/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.entidades;

/**
 * Datos del cliente que realizo el pedido
 * @author Emmanuel Riveros
 */
public class Cliente {

    // Nombre del cliente
    private String nombre;
    // Domicilio donde se encuentra el cliente
    private String domicilio;
    // Celular del cliente
    private String celular;
    
    /**
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre del cliente a declarar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return domicilio del cliente
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio domicilio del cliente a declarar
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return celular del cliente
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular celular del cliente a declarar
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
   
}
