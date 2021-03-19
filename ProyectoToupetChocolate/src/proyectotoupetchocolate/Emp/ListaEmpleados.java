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
public class ListaEmpleados {
    
    NodoEmpleado inicio;
    NodoEmpleado fin;
    
     public ListaEmpleados(){
        inicio = fin = null;
    }
    
    public boolean esVacia(){
        return inicio == fin && fin == null;
    }
    
    public void agregarInicio(Empleado dato){
        NodoEmpleado nuevo = new NodoEmpleado(dato, null, inicio);
        if(esVacia()){
            inicio = fin = nuevo;
        }else{
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    
    }
    
    public void agregarFin(Empleado dato){
        NodoEmpleado nuevo = new NodoEmpleado(dato, fin, null);
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
    
    public void eliminarNodo2(int dato){
        NodoEmpleado aux = obtenerNodo(dato);
        if(aux == inicio && aux == fin){
            inicio = fin = null;
            aux.setAnterior(null);
            aux.setSiguiente(null);
        }else if(aux == fin){
            fin = fin.getAnterior();
            aux.getAnterior().setSiguiente(null);
        }else if(aux == inicio){
            inicio = inicio.getSiguiente();
            aux.getSiguiente().setAnterior(null);
        }else{
            aux.getAnterior().setSiguiente(aux.getSiguiente());
            aux.getSiguiente().setAnterior(aux.getAnterior());
        }
    }
    
    public int cantidad(){
        NodoEmpleado aux = inicio;
        int cont = 0;
        while(aux != null){
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }
    
    public void imprimirFin(){
        NodoEmpleado aux = fin;
        while(aux != null){
            System.out.println("Nombre: " + aux.getDato().getNombre() +
                    "\nApellido: " + aux.getDato().getApellido() +
                    "\nCedula: " + aux.getDato().getCedula() +
                    "\nDomicilio: " + aux.getDato().getDomicilio() +
                    "\nNombre de usuario: " + aux.getDato().getNombreUsuario() +
                    "\nEventos Asignados: " + aux.getDato().getEventosAsignados() +
                    "\nEventos Asistidos: " + aux.getDato().getEventosAsistidos() +
                    "\nEventos Postulados: " + aux.getDato().getEventosPostulados() +
                    "\nTareas Pendientes: " + aux.getDato().getTareasPendientes() +
                    "\nPaga por hora: " + aux.getDato().getPagaHora());
            aux = aux.getAnterior();
        }
    }
    
    public void imprimirInicio(){
        NodoEmpleado aux = inicio;
        while(aux != null){
            System.out.println("Nombre: " + aux.getDato().getNombre() +
                    "\nApellido: " + aux.getDato().getApellido() +
                    "\nCedula: " + aux.getDato().getCedula() +
                    "\nDomicilio: " + aux.getDato().getDomicilio() +
                    "\nNombre de usuario: " + aux.getDato().getNombreUsuario() +
                    "\nEventos Asignados: " + aux.getDato().getEventosAsignados() +
                    "\nEventos Asistidos: " + aux.getDato().getEventosAsistidos() +
                    "\nEventos Postulados: " + aux.getDato().getEventosPostulados() +
                    "\nTareas Pendientes: " + aux.getDato().getTareasPendientes() +
                    "\nPaga por hora: " + aux.getDato().getPagaHora());
            aux = aux.getSiguiente();
        }
    }
    
     public NodoEmpleado obtenerNodo2(String nombre) {
            NodoEmpleado aux = inicio;
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
     
     public NodoEmpleado obtenerNodo(int indice){
        if(indice < 0){
            System.out.println("no existen indicies negativos");
            return null;
        }else{
            NodoEmpleado aux = inicio;
            int cont = 0;
            while(cont < indice){
                aux = aux.getSiguiente();
                cont++;
            }
            return aux;
        }
    
    }
    
    
}
