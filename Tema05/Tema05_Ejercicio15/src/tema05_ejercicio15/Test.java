/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio15;

/**
 *
 * @author User
 */
public class Test {

    //Método que muestra por pantalla los datos de una dirección
    public static void mostrarDireccion(Direccion direccion) {
        System.out.println("Dirección:");
        System.out.println("\tCalle: " + direccion.getCalle());
        System.out.println("\tNúmero: " + direccion.getNumero());
        System.out.println("\tPuerta: " + direccion.getPiso());
        System.out.println("\tCiudad: " + direccion.getCiudad());
    }
    
    //Método que muestra por pantalla los datos de un empleado
    public static void mostrarEmpleado(Empleado empleado, int posicion) {
        System.out.println("EMPLEADO " + posicion + ":");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
        mostrarDireccion(empleado.getDireccion());
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos las tres direcciones
        Direccion dir1 = new Direccion("Calle Real", 12, "2ºA", "Plasencia");
        Direccion dir2 = new Direccion("Avenida de España", 5, "1ºC", "Cáceres");
        Direccion dir3 = new Direccion("Calle Mayor", 23, "3ºB", "Mérida");

        //Creamos los tres empleados, asignándoles una dirección a cada uno
        Empleado emp1 = new Empleado("Ana López", 1500, dir1);
        Empleado emp2 = new Empleado("Luis Pérez", 1800, dir2);
        Empleado emp3 = new Empleado("María Gómez", 2100, dir3);

        //Mostramos los datos de cada empleado
        mostrarEmpleado(emp1, 1);
        mostrarEmpleado(emp2, 2);
        mostrarEmpleado(emp3, 3);
    }
    
}
