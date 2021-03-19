/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi.Alert;

import proyectotoupetchocolate.Emp.Empleado;

/**
 *
 * @author crome
 */
public class NodoPost {
    private NodoPost siguiente;
    Empleado usuario;

    public NodoPost(Empleado usuario, NodoPost siguiente) {
        this.siguiente = siguiente;
        this.usuario = usuario;
    }

    public NodoPost getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPost siguiente) {
        this.siguiente = siguiente;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return  usuario.toString();
    }
    
    
    
}
