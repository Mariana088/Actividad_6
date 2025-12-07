/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanacontacto;

import java.util.Vector;

/**
 * Esta clase denominada ListaContactos define una lista de objetos de
 * tipo Contacto.
 * @version 1.0/2020
 */
public class ListaContactos {
    Vector lista;
    
    /**
     * Constructor de la clase ListaContactos
     */
    ListaContactos() {
        lista = new Vector();
    }
    
    /**
     * Método que agrega un contacto a la lista de contactos
     * @param contacto Parámetro que define el contacto a agregar
     */
    void agregarContacto(Contacto contacto) {
        lista.add(contacto);
    }
}
