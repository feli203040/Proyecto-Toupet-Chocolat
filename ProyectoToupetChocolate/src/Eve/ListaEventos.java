/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eve;

import proyectotoupetchocolate.Emp.NodoEmpleado;

/**
 *
 * @author crome
 */
public class ListaEventos {
    
    private NodoEvento inicio, fin;
    
    public ListaEventos(){
        inicio = fin = null;
    }
    
    public boolean esVacia(){
        return inicio == fin && fin == null;
    }
    
    public void agregarInicio(Evento dato){
        NodoEvento nuevo = new NodoEvento(dato, null, inicio);
        if(esVacia()){
            inicio = fin = nuevo;
        }else{
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    
    }
    
    
    public void agregarFin(Evento dato){
        NodoEvento nuevo = new NodoEvento(dato, fin, null);
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
    public void eliminarTodo(){
        inicio=null;
        fin=null;
    }
    public void eliminarInicio(){
        if(inicio == fin && inicio != null){
            inicio = fin = null;
            System.out.println("Ultimo nodo eliminado");
        }else if(esVacia()){
            System.out.println("Lista vacia");
        }else{
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
    }
    
    public void eliminarNodo2(int dato){
        NodoEvento aux = obtenerNodo(dato);
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
        NodoEvento aux = inicio;
        int cont = 0;
        while(aux != null){
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }
    
    /*Este metodo lo que hace es imprimir los atributos de cada nodo dentro de la lista,
    el try catch es porque al crear un evento este aun no tiene personal asignado por lo que
    ese atributo seria nulo, de forma que se gestiona mediante el trycatch.
    Tambien llama a un metodo similar pero de la clase inventario que hace exactamente lo mismo,
    imprimir los atributos asignados a un objeto inventario que a su vez pertenece a un objeto evento*/
    public void imprimirInicio(){
        NodoEvento aux = inicio;
        int cont=1;
        while(aux != null){
            System.out.println("Evento #"+(cont)+": ");
            System.out.println("Empleador: "+aux.getDato().getEmpleador());
            System.out.println("Dirección: "+aux.getDato().getDireccion());
            System.out.println("Fecha: "+aux.getDato().getFecha());
            System.out.println("Número personas: "+aux.getDato().getNumeroPersonas());
            System.out.println("Duración minutos: "+aux.getDato().getDuracionMinutos());
            System.out.println("Paga contrato: "+aux.getDato().getPagaContrato());
            try{
                System.out.println("Encargado: "+aux.getDato().getEncargardo().getDato().getNombre()+" "+aux.getDato().getEncargardo().getDato().getApellido());
            }catch(Exception e){
                System.out.println("Encargado: No encargado aún.");
            }
            
            System.out.println("Inventario: "+aux.getDato().getCosas().imprimirDatos());
            aux = aux.getSiguiente();
            cont++;
        }
    }
    
    
    
    public Evento obtenerNodo2(String nombre) {
            NodoEvento aux = inicio;
            int cont = 0;
            while (cont < cantidad()) {
                if (nombre == aux.getDato().getEmpleador()) {
                    return aux.getDato();
                }
                cont++;
                aux = aux.getSiguiente();
            }
            return null;
    }
    
    public NodoEvento obtenerNodo(int indice){
        NodoEvento aux = inicio;
        if(indice < 0){
            System.out.println("no existen indicies negativos");
            return null;
        }else{          
            int cont = 0;
            while(cont != indice){              
                aux = aux.getSiguiente();
                cont++;
            }
            return aux;
        }
    
    }
    
     public int size(){
        NodoEvento aux=inicio;
        int cont=0;
        while (aux!=null){
            cont++;
            aux=aux.getSiguiente();
        }
        return cont;
    }
    
    
}
