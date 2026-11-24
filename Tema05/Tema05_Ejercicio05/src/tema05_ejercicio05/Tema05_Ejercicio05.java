/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio05 {

    //Método que pide la nota de una asignatura y lo devuelve
    public static double pedirNota(Asignatura asig) {
        Scanner teclado = new Scanner(System.in);
        double nota;

        System.out.print("Introduzca la nota de " + asig.getNombre() + ": ");
        nota = teclado.nextDouble();

        return nota;
    }

    //Método que recibe las 6 notas y devuelve la nota media
    public static double calcularMedia(double n1, double n2, double n3, double n4,
            double n5, double n6) {
        double media;

        media = (n1 + n2 + n3 + n4 + n5 + n6) / 6;

        return media;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media;

        //Creamos las asignaturas (el constructor asigna el nombre)
        Asignatura prog = new Asignatura("Programación");
        Asignatura lmsgi = new Asignatura("Lenguajes de Marcas");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informáticos");
        Asignatura fol = new Asignatura("Formación y Orientación Laboral");

        //Pedimos las notas al usuario y se las asignamos a cada objeto
        prog.setNota(pedirNota(prog));
        lmsgi.setNota(pedirNota(lmsgi));
        bd.setNota(pedirNota(bd));
        ed.setNota(pedirNota(ed));
        si.setNota(pedirNota(si));
        fol.setNota(pedirNota(fol));

        //Calculamos la media pasando las 6 notas como argumentos
        media = calcularMedia(prog.getNota(), lmsgi.getNota(), bd.getNota(),
                ed.getNota(), si.getNota(), fol.getNota());

        System.out.println("Su nota media del curso es de: " + media);
    }

}
