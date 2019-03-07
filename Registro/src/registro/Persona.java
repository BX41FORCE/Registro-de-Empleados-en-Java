/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author bcortez
 */
public class Persona {

    private String nombre;
    private String edad;
    private String fecha;

    public Persona() {
    }

    public void setNombre() {
        nombre = JOptionPane.showInputDialog("Por Favor Ingresa tu nombre");
    }

    public void setFecha() {
        fecha = JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento\nEn el Formato (Día/Mes/Año)");
    }

    public void setEdad() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        edad = ("Su Edad es: " + periodo.getYears() + " Años, " + periodo.getMonths() + " Meses y " + periodo.getDays() + " Dias");
    }

    public String getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }
}
