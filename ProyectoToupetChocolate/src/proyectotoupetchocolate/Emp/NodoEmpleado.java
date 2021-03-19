/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotoupetchocolate.Emp;

/**
 *
 * @author crome
 */
public class NodoEmpleado {

    Empleado dato;
    NodoEmpleado anterior;
    NodoEmpleado siguiente;

    public NodoEmpleado() {
        anterior = siguiente = null;
    }

    public NodoEmpleado(Empleado dato, NodoEmpleado anterior, NodoEmpleado siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public NodoEmpleado getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEmpleado anterior) {
        this.anterior = anterior;
    }

    public NodoEmpleado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleado siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + dato.toString();
    }
}
