/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;

/**
 * Esta clase define el punto de ingreso al programa de ingreso y salida
 * de huéspedes de un hotel. Por lo tanto, cuenta con un método main
 * de acceso al programa.
 * @version 1.2/2020
 */
public class Principal {
    /**
     * Método main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal;
        Hotel hotel = new Hotel();
        miVentanaPrincipal = new VentanaPrincipal(hotel);
        miVentanaPrincipal.setVisible(true);
    }
}