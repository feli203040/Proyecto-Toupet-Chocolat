package proyectotoupetchocolate;

import Admi.Admin;
import Admi.Alert.Alerta;
import Admi.Alert.ColaPost;
import Admi.Alert.ListaAlertas;
import Admi.ListaAdmin;
import Eve.Evento;
import Eve.ListaEventos;
import java.util.Scanner;
import proyectotoupetchocolate.*;
import proyectotoupetchocolate.Emp.Empleado;
import proyectotoupetchocolate.Emp.ListaEmpleados;
import proyectotoupetchocolate.Emp.NodoEmpleado;

/**
 *
 * @author Barahona, Gualoto, Figueroa
 */
public class main {
    public static Inventario cosas=new Inventario(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static ListaAdmin l0 = new ListaAdmin();
    public static ListaEmpleados l1 = new ListaEmpleados();
    public static ListaEventos eve = new ListaEventos();
    public static ListaAlertas alertas = new ListaAlertas();  
   // public static Empleado empleado= new Empleado("Sin asignar", "", "", "", "", "", 0, 0, 0, 0, 0);
   // public static NodoEmpleado encargado= new NodoEmpleado(empleado, null, null);
    public static void main(String[] args) {

        /*
       
        DATOS DE LA SIMULACION DE PROCESOS AQUI
        
         */
        
        l0.agregarInicio(new Admin("Camila", "Solorzano", "1742306988", "El bosque", "camipro", "admin", 0, 0, 0));
        l1.agregarInicio(new Empleado("Jose", "Burbano", "1725458967",
                "El Condado", "josefu123", "password chida", 0, 0, 0, 0, 0));
        l1.agregarInicio(new Empleado("Maria", "Mendez", "1725234856",
                "Bellavista", "marimar25", "password chida", 0, 0, 0, 0, 0));
        l1.agregarInicio(new Empleado("Miguel", "Cervantez", "1745987631",
                "La floresta", "migu32", "password chida", 0, 0, 0, 0, 0));
        //eve.agregarInicio(new Evento(cosas, encargado, "10/10/10", 60, 100, "El Batan", "Felipe", 300));
        
        //Inventario stuff1 = new Inventario(3, 5, 6, 9, 4, 2, 1, 4, 7, 5);//Inventario general
        //Inventario stuff = new Inventario(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);//Inventario para asignar a los eventos
        
        

        /*
        
        FIN DATOS SIMULACION
        
         */
        Login log = new Login();
        log.setVisible(true);
    }

   

    public static Evento ingresarDatosEvento() {

        String empleador, direccion, fecha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Empleador: ");
        empleador = sc.nextLine();
        System.out.println("Dirección: ");
        direccion = sc.nextLine();
        System.out.println("Fecha: ");
        fecha = sc.nextLine();
        System.out.println("Número personas: ");
        int personas = sc.nextInt();
        System.out.println("Duración minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Paga contrato: ");
        int pagaContrato = sc.nextInt();
        System.out.println("");

        Inventario invNew = new Inventario(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Evento nuevo = new Evento(invNew, null, fecha, minutos, pagaContrato, direccion, empleador, personas);

        return nuevo;

    }

}
