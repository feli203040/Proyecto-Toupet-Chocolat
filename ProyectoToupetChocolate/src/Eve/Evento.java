/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eve;

import proyectotoupetchocolate.Emp.Empleado;
import proyectotoupetchocolate.Emp.NodoEmpleado;
import proyectotoupetchocolate.Inventario;

/**
 *
 * @author crome
 */
public class Evento {
    private Inventario cosas;
    private NodoEmpleado encargardo;
    private String fecha;
    private int duracionMinutos;
    private float pagaContrato;
    private String direccion;
    private String empleador;
    private int numeroPersonas;
    int alerta = 0;
    
    public Evento(Inventario cosas, NodoEmpleado encargardo, String fecha, 
            int duracionMinutos, float pagaContrato, String direccion, 
            String empleador, int numeroPersonas) {
        this.cosas = cosas;
        this.encargardo = encargardo;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
        this.pagaContrato = pagaContrato;
        this.direccion = direccion;
        this.empleador = empleador;
        this.numeroPersonas = numeroPersonas;
    }
    
    public void crearAlerta(){
        alerta++;
    }
    
    public void eliminarAlerta(){
        alerta--;
    }

    public Inventario getCosas() {
        return cosas;
    }

    public void setCosas(Inventario cosas) {
        this.cosas = cosas;
    }

    public NodoEmpleado getEncargardo() {
        return encargardo;
    }

    public void setEncargardo(NodoEmpleado encargardo) {
        this.encargardo = encargardo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public float getPagaContrato() {
        return pagaContrato;
    }

    public void setPagaContrato(float pagaContrato) {
        this.pagaContrato = pagaContrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    public int getAlerta(){
        return alerta;
    }
    
    public void imprimirIndividual(){
        
            System.out.println("Empleador: "+empleador);
            System.out.println("Dirección: "+direccion);
            System.out.println("Fecha: "+fecha);
            System.out.println("Número personas: "+numeroPersonas);
            System.out.println("Duración minutos: "+duracionMinutos);
            System.out.println("Paga contrato: "+pagaContrato);
            try{
                System.out.println("Encargado: "+encargardo.getDato().getNombre()+" "+encargardo.getDato().getApellido());
            }catch(Exception e){
                System.out.println("Encargado: No encargado aún.");
            }
            
            System.out.println("Inventario: "+cosas.imprimirDatos());
            
            
        
    }

    public String imprimirInfo(){
            String info="Empleador: "+empleador+"\nDirección: "+direccion+"\nFecha: "+fecha+"\nNúmero personas: "+numeroPersonas
                    +"\nDuración minutos: "+duracionMinutos+"\nPaga contrato: "+pagaContrato;
            System.out.println("Empleador: "+empleador);
            System.out.println("Dirección: "+direccion);
            System.out.println("Fecha: "+fecha);
            System.out.println("Número personas: "+numeroPersonas);
            System.out.println("Duración minutos: "+duracionMinutos);
            System.out.println("Paga contrato: "+pagaContrato);
            return info;
    }
    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Duracion: " + duracionMinutos + " minutos, Paga: $" + pagaContrato + ", Direccion: " + direccion+
                ", Encargado: "+encargardo.getDato().getNombre()+" "+encargardo.getDato().getApellido();
    }
    
    
}
