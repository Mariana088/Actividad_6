/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanacontacto;

import java.time.LocalDate;

/**
 * Esta clase denominada Contacto define un contacto para una agenda
 * de contactos.
 * @version 1.0/2020
 */
public class Contacto {
    String nombres;
    String apellidos;
    LocalDate fechaNacimiento;
    String dirección;
    String teléfono;
    String correo;
    
    /**
     * Constructor de la clase Contacto
     * @param nombres Parámetro que define los nombres de un contacto
     * @param apellidos Parámetro que define los apellidos de un contacto
     * @param fechaNacimiento Parámetro que define la fecha de nacimiento de un contacto
     * @param dirección Parámetro que define la dirección de un contacto
     * @param teléfono Parámetro que define el teléfono de un contacto
     * @param correo Parámetro que define el correo de un contacto
     */
    Contacto(String nombres, String apellidos, LocalDate fechaNacimiento, 
             String dirección, String teléfono, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.correo = correo;
    }
}
