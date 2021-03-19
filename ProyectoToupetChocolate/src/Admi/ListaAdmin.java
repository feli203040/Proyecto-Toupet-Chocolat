/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi;

import proyectotoupetchocolate.Emp.Empleado;
import proyectotoupetchocolate.Emp.NodoEmpleado;

/**
 *
 * @author crome
 */
public class ListaAdmin {
    NodoAdmin inicio, fin;
    
    public ListaAdmin(){
        inicio = fin = null;
    }
    
    public boolean esVacia(){
        return inicio == fin && fin == null;
    }
    
    public void agregarInicio(Admin dato){
        NodoAdmin nuevo = new NodoAdmin(dato, null, inicio);
        if(esVacia()){
            inicio = fin = nuevo;
        }else{
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    
    }
    
    public void agregarFin(Admin dato){
        NodoAdmin nuevo = new NodoAdmin(dato, fin, null);
        if(esVacia()){
            inicio = fin = nuevo;
        }else{
            inicio.setSiguiente(nuevo);
            inicio = nuevo;
        }
    }
    
    public void eliminarFin(){
        if(inicio == fin && fin != null){
            inicio = fin = null;
            System.out.println("Ultimo elemento borrado");
        }else if(esVacia()){
            System.out.println("lista vacia");
        }else{
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
    }
    public void eliminarInicio(){
        if(inicio == fin && inicio != null){
            inicio = fin = null;
            System.out.println("ultimo nodo eliminado");
        }else if(esVacia()){
            System.out.println("Lista vacia");
        }else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }
    
    public int cantidad(){
        NodoAdmin aux = inicio;
        int cont = 0;
        while(aux != null){
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }
    
    public void imprimirFin(){
        NodoAdmin aux = fin;
        while(aux != null){
            System.out.println("Nombre: " + aux.getDato().getNombre() +
                    "\nApellido: " + aux.getDato().getApellido() +
                    "\nCedula: " + aux.getDato().getCedula() +
                    "\nDomicilio: " + aux.getDato().getDomicilio() +
                    "\nNombre de usuario: " + aux.getDato().getNombreUsuario() +
                    "\nEventos Creados: " + aux.getDato().getEventosCreados() +
                    "\nEventos sin Asignar: " + aux.getDato().getEventosSinAsignar()+
                    "\nAlertas Enviadas: " + aux.getDato().getAlertasEnviadas());
            aux = aux.getAnterior();
        }
    }
    
    public void imprimirInicio(){
        NodoAdmin aux = inicio;
        while(aux != null){
            System.out.println("Nombre: " + aux.getDato().getNombre() +
                    "\nApellido: " + aux.getDato().getApellido() +
                    "\nCedula: " + aux.getDato().getCedula() +
                    "\nDomicilio: " + aux.getDato().getDomicilio() +
                    "\nNombre de usuario: " + aux.getDato().getNombreUsuario() +
                    "\nEventos Creados: " + aux.getDato().getEventosCreados() +
                    "\nEventos sin Asignar: " + aux.getDato().getEventosSinAsignar()+
                    "\nAlertas Enviadas: " + aux.getDato().getAlertasEnviadas());
            aux = aux.getSiguiente();
        }
    }
    
    public NodoAdmin obtenerNodo2(String nombre) {
            NodoAdmin aux = inicio;
            int cont = 0;
            while (cont < cantidad()) {
                if (nombre.equals(aux.getDato().getNombreUsuario())) {
                    return aux;
                }
                cont++;
                aux = aux.getSiguiente();
            }
            return null;
    }
}
