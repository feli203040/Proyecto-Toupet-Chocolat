/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi.Alert;

import proyectotoupetchocolate.Emp.Empleado;
import proyectotoupetchocolate.Emp.NodoEmpleado;

/**
 *
 * @author crome
 */
public class ColaPost {

    NodoPost inicio, fin;

    public ColaPost() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == fin && fin == null;
    }

    public void encolar(Empleado postulante) {
        NodoPost post = new NodoPost(postulante, null);
        if (esVacia()) {
            inicio = fin = post;
        } else {
            fin.setSiguiente(post);
            fin = post;
        }

    }

    public String desencolar() throws Exception {

        if (esVacia()) {
            throw new Exception();
        }
        NodoPost aux = inicio;
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = inicio;
            return null;
        }
        return aux.getUsuario().getNombre();
    }
    
    public void imprimir() throws Exception{
        if(esVacia()){
        throw new Exception();
        }
        NodoPost aux = inicio;
        int i = 1;
        while(aux != null){
            System.out.println("Postulante numero: " + i);
            System.out.println("Nombre: " + aux.getUsuario().getNombre());
            System.out.println("Cedula: " + aux.getUsuario().getCedula());
            aux = aux.getSiguiente();
            i++;
        }
        
    }
    
    public NodoPost obtenerNodo(int indice){
        if(indice < 0){
            System.out.println("no existen indicies negativos");
            return null;
        }else{
            NodoPost aux = inicio;
            int cont = 0;
            while(cont < indice){
                cont++;
                aux = aux.getSiguiente();
            }
            return aux;
        }
    
    }
    
    public int size(){
        NodoPost aux=inicio;
        int cont=0;
        while (aux!=null){
            cont++;
            aux=aux.getSiguiente();
        }
        return cont;
    }
}
