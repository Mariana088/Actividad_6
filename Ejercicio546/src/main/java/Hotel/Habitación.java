/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 * Esta clase denominada Habitación define una habitación de un hotel
 * a ser ocupada y desocupada por un huésped.
 * @version 1.2/2020
 */
public class Habitación {
    private int númeroHabitación;
    private boolean disponible;
    private double precioDía;
    private Huésped huésped;
    
    /**
     * Constructor de la clase Habitación
     * @param númeroHabitación Parámetro que define el número de la habitación
     * @param disponible Parámetro que define la disponibilidad de la habitación
     * @param precioDía Parámetro que define el precio por día de la habitación
     */
    public Habitación(int númeroHabitación, boolean disponible, double precioDía) {
        this.númeroHabitación = númeroHabitación;
        this.disponible = disponible;
        this.precioDía = precioDía;
    }
    
    /**
     * Método que obtiene el número de habitación
     * @return El número de habitación
     */
    public int getNúmeroHabitación() {
        return númeroHabitación;
    }
    
    /**
     * Método que obtiene la disponibilidad de la habitación
     * @return La disponibilidad de la habitación
     */
    public boolean getDisponible() {
        return disponible;
    }
    
    /**
     * Método que obtiene el precio por día de la habitación
     * @return El precio por día de la habitación
     */
    public double getPrecioDía() {
        return precioDía;
    }
    
    /**
     * Método que obtiene el huésped de la habitación
     * @return El huésped de la habitación
     */
    public Huésped getHuésped() {
        return huésped;
    }
    
    /**
     * Método que establece el huésped de la habitación
     * @param huésped Parámetro que define el huésped de la habitación
     */
    public void setHuésped(Huésped huésped) {
        this.huésped = huésped;
    }
    
    /**
     * Método que establece la disponibilidad de la habitación
     * @param disponible Parámetro que define la disponibilidad de la habitación
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
