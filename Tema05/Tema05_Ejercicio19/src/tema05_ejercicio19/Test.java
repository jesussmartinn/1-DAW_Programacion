/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    //Constante con las horas que se pagan a tarifa normal
    final static int HORAS_NORMALES = 40;

    //Constante con el multiplicador de la tarifa para las horas extra (tarifa y media)
    final static double TARIFA_EXTRA = 1.5;

    //Método que pide el nombre de un empleado y lo devuelve
    public static String pedirNombre(int posicion) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.print("Introduzca el nombre del empleado " + posicion + ": ");
        nombre = teclado.nextLine();

        return nombre;
    }

    //Método que pide las horas trabajadas por un empleado y las devuelve
    public static int pedirHoras(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int horas;

        System.out.print("Introduzca las horas que ha trabajado " + nombre + ": ");
        horas = teclado.nextInt();

        return horas;
    }

    //Método que pide la tarifa por hora de un empleado y la devuelve
    public static double pedirTarifa(String nombre) {
        Scanner teclado = new Scanner(System.in);
        double tarifa;

        System.out.print("Introduzca la tarifa por hora de " + nombre + ": ");
        tarifa = teclado.nextDouble();

        return tarifa;
    }

    //Método que pide los datos de un empleado, crea el objeto y lo devuelve
    public static Empleado crearEmpleado(int posicion) {
        String nombre;
        int horas;
        double tarifa;

        nombre = pedirNombre(posicion);
        horas = pedirHoras(nombre);
        tarifa = pedirTarifa(nombre);

        return new Empleado(nombre, horas, tarifa);
    }

    //Método que calcula y devuelve el sueldo de un empleado
    public static double calcularSueldo(Empleado empleado) {
        double sueldo;
        int horasExtra;

        if (empleado.getHoras() <= HORAS_NORMALES) {
            sueldo = empleado.getHoras() * empleado.getTarifa();
        } else {
            horasExtra = empleado.getHoras() - HORAS_NORMALES;
            sueldo = (HORAS_NORMALES * empleado.getTarifa())
                    + (horasExtra * empleado.getTarifa() * TARIFA_EXTRA);
        }

        return sueldo;
    }

    //Método que determina y muestra por pantalla el sueldo bruto de un empleado
    public static void mostrarSueldo(Empleado empleado) {
        double sueldo;

        sueldo = calcularSueldo(empleado);
        System.out.println(empleado.getNombre() + " trabajó " + empleado.getHoras()
                + " horas, cobra " + empleado.getTarifa() + " euros la hora por lo que"
                + " le corresponde un sueldo de " + sueldo + " euros.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los tres empleados pidiendo sus datos al usuario
        Empleado emp1 = crearEmpleado(1);
        Empleado emp2 = crearEmpleado(2);
        Empleado emp3 = crearEmpleado(3);

        //Mostramos el sueldo bruto de cada uno
        mostrarSueldo(emp1);
        mostrarSueldo(emp2);
        mostrarSueldo(emp3);
    }
    
}
