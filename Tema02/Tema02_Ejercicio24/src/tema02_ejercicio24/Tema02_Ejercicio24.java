/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio24;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio24 {
    final static float ASIGNATURAS = 6f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner prog = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Programación: ");
        float notaProg = prog.nextFloat();
        
        Scanner lm = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Lenguaje de Marcas: ");
        float notaLm = lm.nextFloat();
        
        Scanner bd = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Bases de Datos: ");
        float notaBd = bd.nextFloat();
        
        Scanner ed = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo: ");
        float notaEd = ed.nextFloat();
        
        Scanner si = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos: ");
        float notaSi = si.nextFloat();
        
        Scanner fol = new Scanner(System.in);
        System.out.println("Por último, introduzca la nota de Formación y Orientación"
                + " Laboral: ");
        float notaFol = fol.nextFloat();
        
        float notaMedia = (notaProg + notaLm + notaBd + notaEd + notaSi + notaFol) 
                / ASIGNATURAS;
        System.out.println("Su nota media del curso es de: " + notaMedia);
    }
    
}
