/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi.Alert;

import Eve.Evento;
import proyectotoupetchocolate.Emp.Empleado;

/**
 *
 * @author crome
 */
public class Alerta {
   
    Empleado dato;
    Evento event;
    ColaPost postulantes;

    public Alerta(Evento event) {
        postulantes = new ColaPost();
        this.event = event;
    }

    
    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public Evento getEvent() {
        return event;
    }

    public void setEvent(Evento event) {
        this.event = event;
    }

    public ColaPost getPostulantes() {
        return postulantes;
    }

    public void setPostulantes(ColaPost postulantes) {
        this.postulantes = postulantes;
    }

    @Override
    public String toString() {
        return "" + event.toString();
    }
    
}
