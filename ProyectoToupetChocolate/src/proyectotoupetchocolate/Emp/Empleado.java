/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotoupetchocolate.Emp;

import proyectotoupetchocolate.Usuario;

/**
 *
 * @author crome
 */
public class Empleado extends Usuario {
    
    int eventosAsignados, eventosAsistidos, eventosPostulados, tareasPendientes;
    double pagaHora, gananciasMes;

    public Empleado(String nombre, String apellido, String cedula, String domicilio, 
            String nombreUsuario, String contrasenia,
            int eventosAsignados, int eventosAsistidos, int eventosPostulados,
            int tareasPendientes, double pagaHora) {
        super(nombre, apellido, cedula, domicilio, nombreUsuario, contrasenia);
        this.eventosAsignados = eventosAsignados;
        this.eventosAsistidos = eventosAsistidos;
        this.eventosPostulados = eventosPostulados;
        this.tareasPendientes = tareasPendientes;
        this.pagaHora = pagaHora;
    }

    public Empleado(int eventosAsignados, int eventosAsistidos, int eventosPostulados, int tareasPendientes, double pagaHora, double gananciasMes, String nombre, String apellido, String cedula, String domicilio, String nombreUsuario, String contrasenia) {
        super(nombre, apellido, cedula, domicilio, nombreUsuario, contrasenia);
        this.eventosAsignados = eventosAsignados;
        this.eventosAsistidos = eventosAsistidos;
        this.eventosPostulados = eventosPostulados;
        this.tareasPendientes = tareasPendientes;
        this.pagaHora = pagaHora;
        this.gananciasMes = gananciasMes;
    }
    
    

    public int getEventosAsignados() {
        return eventosAsignados;
    }

    public void setEventosAsignados(int eventosAsignados) {
        this.eventosAsignados = eventosAsignados;
    }

    public int getEventosAsistidos() {
        return eventosAsistidos;
    }

    public void setEventosAsistidos(int eventosAsistidos) {
        this.eventosAsistidos = eventosAsistidos;
    }

    public int getEventosPostulados() {
        return eventosPostulados;
    }

    public void setEventosPostulados(int eventosPostulados) {
        this.eventosPostulados = eventosPostulados;
    }

    public int getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(int tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    public double getPagaHora() {
        return pagaHora;
    }

    public void setPagaHora(double pagaHora) {
        this.pagaHora = pagaHora;
    }

    public double getGananciasMes() {
        return gananciasMes;
    }

    public void setGananciasMes(double gananciasMes) {
        this.gananciasMes = gananciasMes;
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }
    
    
    
    
    
    
    
}
