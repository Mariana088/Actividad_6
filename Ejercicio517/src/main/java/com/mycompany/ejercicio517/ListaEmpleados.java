/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio517;

import java.util.Vector;

public class ListaEmpleados {
   public Vector lista;
    public double totalNómina = 0; 
    public ListaEmpleados() {
        lista = new Vector(); 
    }

    public void agregarEmpleado(Empleado a) {
        lista.add(a);
    }
    
    
    public double calcularTotalNómina() {
        for (int i = 0; i < lista.size(); i++) { 
                Empleado e = (Empleado) lista.elementAt(i);
                totalNómina = totalNómina + e.calcularNómina();
            }
    return totalNómina;
    }
    
    public String[][] obtenerMatriz() {
    String datos[][] = new String[lista.size()][3]; 
        for (int i = 0; i < lista.size(); i++) { 
            Empleado e = (Empleado) lista.elementAt(i);  
            datos[i][0] = e.getNombre();
            datos[i][1] = e.getApellidos();
            datos[i][2] = Double.toString(e.calcularNómina());
            totalNómina = totalNómina + e.calcularNómina();
        }
            return datos;
    }  
    public String convertirTexto() {
        String texto = "";
        for (int i = 0; i < lista.size(); i++) { 
        Empleado e = (Empleado) lista.elementAt(i);
        texto = texto + "Nombre = " + e.getNombre() + "\n" + 
        "Apellidos = " + e.getApellidos() + "\n" + "Cargo = " +
        e.getCargo() + "\n" + "Género = " + e.getGénero() + "\n" + 
        "Salario = $ " + e.getSalarioDía() + "\n" + "Días trabajados = " 
        + e.getDíasTrabajados() + "\n" + "Otros ingresos =$" 
        + e.getOtrosIngresos() + "\n" + "Pagos saludo = $"
        + e.getPagosSalud() + "\n" + "Aportes pensiones = $" +
        e.getAportePensiones() + "\n---------\n";
        } 
        texto = texto + "Total nómina = $" + String.format("%.2f",
        calcularTotalNómina());
        return texto;
    }
}
