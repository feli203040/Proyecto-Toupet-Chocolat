/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi.Alert;

/**
 *
 * @author crome
 */
public class NodoAlerta {
    Alerta dato;
    NodoAlerta anterior;
    NodoAlerta siguiente;
    
    public NodoAlerta(){
        anterior = siguiente = null;
    }

    public NodoAlerta(Alerta dato, NodoAlerta anterior, NodoAlerta siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Alerta getDato() {
        return dato;
    }

    public void setDato(Alerta dato) {
        this.dato = dato;
    }

    public NodoAlerta getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoAlerta anterior) {
        this.anterior = anterior;
    }

    public NodoAlerta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAlerta siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return ""+dato.toString();
    }
    
}
