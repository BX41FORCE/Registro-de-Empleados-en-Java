/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import javax.swing.JOptionPane;

/**
 *
 * @author bcortez
 */
public class Empleado extends Persona {
    private Object cargo;
    private String direccion;

    public Empleado() {
    }

    public void setDireccion() {
        direccion = JOptionPane.showInputDialog("Ingrese su dirección");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCargo() {
        Object[] opcion = {"Pasante", "Oficinista", "Contador", "Asesor", "Gerente"};
        cargo = JOptionPane.showInputDialog(null, "Selecciona un Cargo", "Elegir", JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
    }

    public Object getCargo() {
        return cargo;
    }
}
