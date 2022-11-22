/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tdkarnitas.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Enumerador con los tipos de pago que acepta el local
 * @author Emmanuel Riveros
 */
public enum TipoPago {
    /**
     * Tipo de pago con tarjeta.
     */
    @SerializedName("1")
    TARJETA,

    /**
     * Tipo de pago en efectivo.
     */
    @SerializedName("2")
    EFECTIVO
    }
