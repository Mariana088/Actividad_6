/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Esta clase denominada Hotel define un hotel que contiene diez
 * habitaciones a ser ocupadas y liberadas por diferentes huéspedes en
 * fechas determinadas.
 * @version 1.2/2020
 */
public class Hotel {
    public static Vector<Habitación> listaHabitaciones;
    
    /**
     * Constructor de la clase Hotel
     */
    public Hotel() {
        listaHabitaciones = new Vector<Habitación>();
        
        Habitación habitación1 = new Habitación(1, true, 120000);
        Habitación habitación2 = new Habitación(2, true, 120000);
        Habitación habitación3 = new Habitación(3, true, 120000);
        Habitación habitación4 = new Habitación(4, true, 120000);
        Habitación habitación5 = new Habitación(5, true, 120000);
        Habitación habitación6 = new Habitación(6, true, 160000);
        Habitación habitación7 = new Habitación(7, true, 160000);
        Habitación habitación8 = new Habitación(8, true, 160000);
        Habitación habitación9 = new Habitación(9, true, 160000);
        Habitación habitación10 = new Habitación(10, true, 160000);
        
        listaHabitaciones.add(habitación1);
        listaHabitaciones.add(habitación2);
        listaHabitaciones.add(habitación3);
        listaHabitaciones.add(habitación4);
        listaHabitaciones.add(habitación5);
        listaHabitaciones.add(habitación6);
        listaHabitaciones.add(habitación7);
        listaHabitaciones.add(habitación8);
        listaHabitaciones.add(habitación9);
        listaHabitaciones.add(habitación10);
    }
    
    /**
     * Método que dado un número de habitación, busca la fecha de
     * ingreso de un huésped a dicha habitación
     * @param número Número de habitación a buscar
     * @return Fecha de ingreso a la habitación
     */
    public String buscarFechaIngresoHabitación(int número) {
        for(int i = 0; i < listaHabitaciones.size(); i++) {
            Habitación habitación = (Habitación) listaHabitaciones.elementAt(i);
            if (habitación.getNúmeroHabitación() == número) {
                Date fecha = habitación.getHuésped().getFechaIngreso();
                DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
                return formatoFecha.format(fecha);
            }
        }
        return "";
    }
    
    /**
     * Método que dado un número de habitación, devuelve si la
     * habitación está ocupada o no
     * @param número Número de habitación a buscar
     * @return Valor booleano con la disponibilidad de la habitación buscada
     */
    public boolean buscarHabitaciónOcupada(int número) {
        for(int i = 0; i < listaHabitaciones.size(); i++) {
            Habitación habitación = (Habitación) listaHabitaciones.elementAt(i);
            if (habitación.getNúmeroHabitación() == número && 
                !habitación.getDisponible()) {
                return true;
            }
        }
        return false;
    }
}
