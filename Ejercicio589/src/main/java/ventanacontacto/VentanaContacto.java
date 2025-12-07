/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanacontacto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import java.time.LocalDate;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Esta clase denominada VentanaContacto crea una ventana que
 * permite agregar un contacto.
 * @version 1.0/2020
 */
public class VentanaContacto extends Application {
    // Etiquetas
    Label nombres = new Label("Nombres:");
    Label apellidos = new Label("Apellidos:");
    Label fechaNacimiento = new Label("Fecha nacimiento:");
    Label dirección = new Label("Dirección");
    Label correo = new Label("Correo");
    Label teléfono = new Label("Teléfono");
    
    // Campos de texto
    TextField campoNombres = new TextField();
    TextField campoApellidos = new TextField();
    DatePicker campoFechaNacimiento = new DatePicker();
    TextField campoDirección = new TextField();
    TextField campoCorreo = new TextField();
    TextField campoTeléfono = new TextField();
    ListView lista = new ListView();
    
    // Botón
    Button agregar = new Button("Agregar");
    
    /**
     * Método main que lanza la aplicación
     * @param args Parámetro que define los argumentos de la aplicación
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /**
     * Método start que inicia la aplicación
     * @param stage El escenario donde se ejecutará la aplicación
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Establece un grid para los componentes gráficos
        GridPane grid = new GridPane();
        
        // Establece espacios horizontales y verticales entre filas y columnas
        grid.setHgap(5);
        grid.setVgap(5);
        
        // Coloca los controles en el grid
        grid.add(nombres, 0, 0);
        grid.add(apellidos, 0, 1);
        grid.add(fechaNacimiento, 0, 2);
        grid.add(dirección, 0, 3);
        grid.add(teléfono, 0, 4);
        grid.add(correo, 0, 5);
        grid.add(campoNombres, 1, 0);
        grid.add(campoApellidos, 1, 1);
        grid.add(campoFechaNacimiento, 1, 2);
        grid.add(campoDirección, 1, 3);
        grid.add(campoTeléfono, 1, 4);
        grid.add(campoCorreo, 1, 5);
        grid.add(lista, 2, 0, 1, 7);
        
        // Agrega el botón
        VBox buttonBox = new VBox(agregar);
        agregar.setMaxWidth(Double.MAX_VALUE);
        grid.add(buttonBox, 0, 6, 1, 2);
        
        // Muestra los datos en el área de texto al presionar botón agregar
        agregar.setOnAction(e -> mostrarDatos());
        
        // Establece un CSS para el GridPane
        grid.setStyle("-fx-padding: 10;"
                + "-fx-border-style: solid inside;"
                + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: green;");
        
        Scene scene = new Scene(grid, 600, 300);
        stage.setScene(scene);
        stage.setTitle("Detalles del contacto");
        stage.sizeToScene();
        stage.show();
    }
    
    /**
     * Método que captura los datos ingresados de un contacto, crea un
     * contacto, lo añade a la lista de contactos y a la lista gráfica
     */
    private void mostrarDatos() {
        // Captura los datos ingresados
        String a = campoNombres.getText();
        String b = campoApellidos.getText();
        LocalDate c = campoFechaNacimiento.getValue();
        String d = campoDirección.getText();
        String e = campoTeléfono.getText();
        String f = campoCorreo.getText();
        
        // Evalua que los campos no estén vacíos
        if (a.equals("") || b.equals("") || d.equals("") || 
            e.equals("") || f.equals("")) {
            // Si los campos están vacíos, se genera una alerta
            Alert mensaje = new Alert(Alert.AlertType.INFORMATION);
            mensaje.setTitle("Mensaje");
            mensaje.setHeaderText("Error en ingreso de datos");
            mensaje.setContentText("No se permiten campos vacíos");
            mensaje.showAndWait();
        } else {
            // Si los datos se han ingresado correctamente
            Contacto contacto = new Contacto(a, b, c, d, e, f);
            ListaContactos listaContactos = new ListaContactos();
            listaContactos.agregarContacto(contacto);
            
            String data = a + "-" + b + "-" + c + "-" + d + "-" + e + "-" + f;
            lista.getItems().add(data);
            
            // Todos los campos quedan vacíos para ingresar un nuevo contacto
            campoNombres.setText("");
            campoApellidos.setText("");
            campoFechaNacimiento.setValue(null);
            campoDirección.setText("");
            campoTeléfono.setText("");
            campoCorreo.setText("");
        }
    }
}