/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.util.*;

/**
 * Esta clase denominada Huésped define un huésped del hotel que
 * ocupará una determinada habitación por ciertos días.
 * @version 1.2/2020
 */
public class Huésped {
    private String nombres;
    private String apellidos;
    private int documentoIdentidad;
    private Date fechaIngreso;
    private Date fechaSalida;
    
    /**
     * Constructor de la clase Huésped
     * @param nombres Parámetro que define los nombres del huésped
     * @param apellidos Parámetro que define los apellidos del huésped
     * @param documentoIdentidad Parámetro que define el número de
     * documento de identidad del huésped
     */
    public Huésped(String nombres, String apellidos, int documentoIdentidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
    }
    
    /**
     * Método que establece la fecha de salida del huésped
     * @param fecha La fecha de salida del huésped
     */
    public void setFechaSalida(Date fecha) {
        fechaSalida = fecha;
    }
    
    /**
     * Método que establece la fecha de ingreso del huésped
     * @param fecha La fecha de ingreso del huésped
     */
    public void setFechaIngreso(Date fecha) {
        fechaIngreso = fecha;
    }
    
    /**
     * Método que obtiene la fecha de ingreso del huésped
     * @return La fecha de ingreso del huésped
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    
    /**
     * Método que calcula la cantidad de días de alojamiento del huésped
     * @return La cantidad de días de alojamiento del huésped
     */
    public int obtenerDíasAlojamiento() {
        int días = (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
        return días;
    }
}