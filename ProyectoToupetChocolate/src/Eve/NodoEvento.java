/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eve;

/**
 *
 * @author crome
 */
public class NodoEvento {
    Evento dato;
    NodoEvento anterior;
    NodoEvento siguiente;
    
    public NodoEvento(){
        anterior = siguiente = null;
    }
    
    public NodoEvento(Evento dato, NodoEvento anterior, NodoEvento siguiente){
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Evento getDato() {
        return dato;
    }

    public void setDato(Evento dato) {
        this.dato = dato;
    }

    public NodoEvento getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEvento anterior) {
        this.anterior = anterior;
    }

    public NodoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + dato.toString();
    }
    
}
