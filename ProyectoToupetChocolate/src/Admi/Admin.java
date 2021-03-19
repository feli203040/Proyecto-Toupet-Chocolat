/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi;
import proyectotoupetchocolate.Usuario;

/**
 *
 * @author crome
 */
public class Admin extends Usuario{

    int eventosCreados, alertasEnviadas, eventosSinAsignar;

    public Admin(int eventosCreados, int alertasEnviadas, int eventosSinAsignar, String nombre, String apellido, String cedula, String domicilio, String nombreUsuario, String contrasenia) {
        super(nombre, apellido, cedula, domicilio, nombreUsuario, contrasenia);
        this.eventosCreados = eventosCreados;
        this.alertasEnviadas = alertasEnviadas;
        this.eventosSinAsignar = eventosSinAsignar;
    }
    
    public Admin(String nombre, String apellido, String cedula, String domicilio, 
            String nombreUsuario, String contrasenia,
            int eventosCreados, int alertasEnviadas, int EventosSinAsignar) {
        super(nombre, apellido, cedula, domicilio, nombreUsuario, contrasenia);
        this.eventosCreados = eventosCreados;
        this.eventosSinAsignar = eventosSinAsignar;
        this.alertasEnviadas = this.alertasEnviadas;   
    }

    public int getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(int eventosCreados) {
        this.eventosCreados = eventosCreados;
    }

    public int getAlertasEnviadas() {
        return alertasEnviadas;
    }

    public void setAlertasEnviadas(int alertasEnviadas) {
        this.alertasEnviadas = alertasEnviadas;
    }

    public int getEventosSinAsignar() {
        return eventosSinAsignar;
    }

    public void setEventosSinAsignar(int eventosSinAsignar) {
        this.eventosSinAsignar = eventosSinAsignar;
    }
    
    
    
    

    
}
