/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class VentanaIngreso extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel habitación;
    private JButton aceptar, cancelar;
    private JLabel nombre, apellidos, documentoIdentidad;
    private JLabel huésped;
    private JTextField campoNombre, campoApellidos, campoDocumentoIdentidad;
    private JLabel fechaIngreso;
    private JTextField campoFechaIngreso;
    private int númeroHabitaciónReservada;
    private Hotel hotel;
    private Habitación habitaciónReservada;
    
    public VentanaIngreso(Hotel hotel, int númeroHabitaciónReservada) {
        this.hotel = hotel;
        this.númeroHabitaciónReservada = númeroHabitaciónReservada;
        inicio();
        setTitle("Ingreso");
        setSize(290, 250);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(3, 3, 3, 3);
        
        // Habitación
        habitación = new JLabel("Habitación: " + númeroHabitaciónReservada);
        c.gridx = 0;
        c.gridy = 0;
        contenedor.add(habitación, c);
        
        // Fecha de ingreso
        fechaIngreso = new JLabel("Fecha (aaaa-mm-dd):");
        c.gridx = 0;
        c.gridy = 1;
        contenedor.add(fechaIngreso, c);
        
        campoFechaIngreso = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        contenedor.add(campoFechaIngreso, c);
        
        // Etiqueta Huésped
        huésped = new JLabel("Huésped");
        c.gridx = 0;
        c.gridy = 2;
        contenedor.add(huésped, c);
        
        // Nombre
        nombre = new JLabel("Nombre: ");
        c.gridx = 0;
        c.gridy = 3;
        contenedor.add(nombre, c);
        
        campoNombre = new JTextField();
        c.gridx = 1;
        c.gridy = 3;
        contenedor.add(campoNombre, c);
        
        // Apellidos
        apellidos = new JLabel("Apellidos: ");
        c.gridx = 0;
        c.gridy = 4;
        contenedor.add(apellidos, c);
        
        campoApellidos = new JTextField();
        c.gridx = 1;
        c.gridy = 4;
        contenedor.add(campoApellidos, c);
        
        // Documento de identidad
        documentoIdentidad = new JLabel("Doc. Identidad: ");
        c.gridx = 0;
        c.gridy = 5;
        contenedor.add(documentoIdentidad, c);
        
        campoDocumentoIdentidad = new JTextField();
        c.gridx = 1;
        c.gridy = 5;
        contenedor.add(campoDocumentoIdentidad, c);
        
        // Botones
        aceptar = new JButton("Aceptar");
        c.gridx = 0;
        c.gridy = 6;
        contenedor.add(aceptar, c);
        aceptar.addActionListener(this);
        
        cancelar = new JButton("Cancelar");
        c.gridx = 1;
        c.gridy = 6;
        contenedor.add(cancelar, c);
        cancelar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == aceptar) {
            int posición = -1;
            for (int i = 0; i < hotel.listaHabitaciones.size(); i++) {
                Habitación habitación = (Habitación) hotel.listaHabitaciones.elementAt(i);
                if (habitación.getNúmeroHabitación() == this.númeroHabitaciónReservada) {
                    try {
                        posición = i;
                        String fechaIngresada = campoFechaIngreso.getText();
                        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                        Date fecha = formatoFecha.parse(fechaIngresada);
                        
                        Huésped huésped = new Huésped(
                            campoNombre.getText(),
                            campoApellidos.getText(),
                            Integer.parseInt(campoDocumentoIdentidad.getText())
                        );
                        huésped.setFechaIngreso(fecha);
                        habitación.setHuésped(huésped);
                        habitación.setDisponible(false);
                        habitaciónReservada = habitación;
                        
                        hotel.listaHabitaciones.set(posición, habitación);
                        
                        JOptionPane.showMessageDialog(this,
                            "El huésped ha sido registrado",
                            "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                        setVisible(false);
                        break;
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(this,
                            "La fecha no está en el formato solicitado",
                            "Mensaje", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,
                            "Campo nulo o error en formato de numero",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        if (evento.getSource() == cancelar) {
            setVisible(false);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
