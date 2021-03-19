/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi;

/**
 *
 * @author crome
 */
public class NodoAdmin {
    
    Admin dato;
    NodoAdmin anterior, siguiente;
    
    public NodoAdmin(){
        anterior = siguiente =null;
    }
    
    public NodoAdmin(Admin dato, NodoAdmin anterior, NodoAdmin siguiente){
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Admin getDato() {
        return dato;
    }

    public void setDato(Admin dato) {
        this.dato = dato;
    }

    public NodoAdmin getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoAdmin anterior) {
        this.anterior = anterior;
    }

    public NodoAdmin getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAdmin siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
