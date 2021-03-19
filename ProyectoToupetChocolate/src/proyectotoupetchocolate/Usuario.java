/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotoupetchocolate;

/**
 *
 * @author crome
 */
public class Usuario {
    private String nombre, apellido, cedula, domicilio, nombreUsuario, contrasenia;

    public Usuario(String nombre, String apellido, String cedula, String domicilio, String nombreUsuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.domicilio = domicilio;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.contains("[0-9]+")==false){//validacion para que no existan numeros en el string
           this.nombre = nombre; 
        }else{
            System.out.println("El nombre no puede contener numeros");
        }
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.contains("[0-9]+")==false){//validacion para que no existan numeros en el string
            this.apellido = apellido;
        }else {
            System.out.println("El apellido no puede contener numeros");
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula.length()==10 && cedula.contains("[a-zA-Z]+") == false){//validacion para que no existan letras en el string
            this.cedula = cedula;
        }else {
            System.out.println("Numero de cedula invalido");
        }
        
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Cedula: " + cedula + ", Domicilio: " + domicilio + ", Nombre de Usuario:" + nombreUsuario;
    }
    
    
}
