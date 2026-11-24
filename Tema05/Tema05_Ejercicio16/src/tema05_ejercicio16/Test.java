/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio16;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    //Método que pide el nombre de un alumno y lo devuelve
    public static String pedirNombre(int posicion) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.print("Introduzca el nombre del alumno " + posicion + ": ");
        nombre = teclado.nextLine();

        return nombre;
    }

    //Método que comprueba si una nota está entre 0 y 10
    public static boolean esNotaValida(int nota) {
        boolean valida;

        valida = (nota >= 0) && (nota <= 10);

        return valida;
    }

    //Método que pide la nota de un alumno y la devuelve (se repite si no es válida)
    public static int pedirNota(String nombre) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduzca la nota de " + nombre + " (0 a 10): ");
            nota = teclado.nextInt();
            if (!esNotaValida(nota)) {
                System.out.println("Error. La nota debe estar entre 0 y 10.");
            }
        } while (!esNotaValida(nota));

        return nota;
    }

    //Método que pide los datos de un alumno, crea el objeto y lo devuelve
    public static Alumno crearAlumno(int posicion) {
        String nombre;
        int nota;

        nombre = pedirNombre(posicion);
        nota = pedirNota(nombre);

        return new Alumno(nombre, nota);
    }

    //Método que devuelve la calificación correspondiente a la nota del alumno
    public static String calcularCalificacion(Alumno alumno) {
        String calificacion;

        if (alumno.getNota() <= 4) {
            calificacion = "Suspenso";
        } else if (alumno.getNota() <= 6) {
            calificacion = "Bien";
        } else if (alumno.getNota() <= 8) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }

        return calificacion;
    }

    //Método que muestra por pantalla la calificación del alumno
    public static void mostrarCalificacion(Alumno alumno) {
        System.out.println(alumno.getNombre() + " ha sacado un " + alumno.getNota()
                + ": " + calcularCalificacion(alumno));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los tres alumnos pidiendo sus datos al usuario
        Alumno alu1 = crearAlumno(1);
        Alumno alu2 = crearAlumno(2);
        Alumno alu3 = crearAlumno(3);

        //Mostramos la calificación de cada uno
        mostrarCalificacion(alu1);
        mostrarCalificacion(alu2);
        mostrarCalificacion(alu3);
    }
    
}
