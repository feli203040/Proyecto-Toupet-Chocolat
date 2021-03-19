/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admi.Alert;

import Eve.Evento;
import Eve.NodoEvento;

/**
 *
 * @author crome
 */
public class ListaAlertas {

    private NodoAlerta inicio, fin;

    public ListaAlertas() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == fin && fin == null;
    }

    public void agregarInicio(Alerta dato) {
        NodoAlerta nuevo = new NodoAlerta(dato, null, inicio);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }

    }

    public void agregarFin(Alerta dato) {
        NodoAlerta nuevo = new NodoAlerta(dato, fin, null);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setSiguiente(nuevo);
            inicio = nuevo;
        }
    }

    public void eliminarFin() {
        if (inicio == fin && fin != null) {
            inicio = fin = null;
            System.out.println("Ulttimo elemento borrado");
        } else if (esVacia()) {
            System.out.println("lista vacia");
        } else {
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
    }

    public void eliminarInicio() {
        if (inicio == fin && inicio != null) {
            inicio = fin = null;
            System.out.println("ultimo nodo eliminado");
        } else if (esVacia()) {
            System.out.println("Lista vacia");
        } else {
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }

    public void eliminarNodo2(int dato) {
        NodoAlerta aux = obtenerNodo(dato);
        if (aux == inicio && aux == fin) {
            inicio = fin = null;
            aux.setAnterior(null);
            aux.setSiguiente(null);
        } else if (aux == fin) {
            fin = fin.getAnterior();
            aux.getAnterior().setSiguiente(null);
        } else if (aux == inicio) {
            inicio = inicio.getSiguiente();
            aux.getSiguiente().setAnterior(null);
        } else {
            aux.getAnterior().setSiguiente(aux.getSiguiente());
            aux.getSiguiente().setAnterior(aux.getAnterior());
        }
    }

    public int cantidad() {
        NodoAlerta aux = inicio;
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }

    public void imprimirFin() {
        NodoAlerta aux = fin;
        int i = 1;
        while (aux != null) {
            System.out.println("Alerta numero " + i + ":");
            System.out.println("Lugar: " + aux.getDato().getEvent().getDireccion());
            System.out.println("Empleador: " + aux.getDato().getEvent().getEmpleador());
            System.out.println("Fecha: " + aux.getDato().getEvent().getFecha());
            System.out.println("Tiempo: " + aux.getDato().getEvent().getDuracionMinutos());
            aux = aux.getAnterior();
            i++;
        }
    }
    
      public void imprimirInicio() {
        NodoAlerta aux = inicio;
        int i = 1;
        while (aux != null) {
            System.out.println("Alerta numero " + i + ":");
            System.out.println("Lugar: " + aux.getDato().getEvent().getDireccion());
            System.out.println("Empleador: " + aux.getDato().getEvent().getEmpleador());
            System.out.println("Fecha: " + aux.getDato().getEvent().getFecha());
            System.out.println("Tiempo: " + aux.getDato().getEvent().getDuracionMinutos());
            aux = aux.getSiguiente();
            i++;
        }
    }

    public void imprimirPostulantes() {
        NodoAlerta aux = fin;
        int i = 1;
        while (aux != null) {
            System.out.println("Alerta numero " + i + ":");
            //System.out.println("Lugar: " + aux.getDato().getEvent().getDireccion());
            System.out.println("Empleador: " + aux.getDato().getEvent().getEmpleador());
            System.out.println("Fecha: " + aux.getDato().getEvent().getFecha());
            //System.out.println("Tiempo: " + aux.getDato().getEvent().getDuracionMinutos());
            try {
                aux.getDato().getPostulantes().imprimir();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            aux = aux.getAnterior();
            i++;
        }
    }

    public NodoAlerta obtenerNodo2(String nombre) {
        NodoAlerta aux = inicio;
        int cont = 0;
        while (cont < cantidad()) {
            if (nombre == aux.getDato().getEvent().getEmpleador()) {
                return aux;
            }
            cont++;
            aux = aux.getSiguiente();
        }
        return null;
    }

    public NodoAlerta obtenerNodo(int indice) {
        if (indice < 0) {
            System.out.println("no existen indicies negativos");
            return null;
        } else {
            NodoAlerta aux = inicio;
            int cont = 0;
            while (cont < indice) {
                cont++;
                aux = aux.getSiguiente();
            }
            return aux;
        }

    }

}
