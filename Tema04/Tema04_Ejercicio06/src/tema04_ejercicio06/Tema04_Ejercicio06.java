/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio06;
import java.util.Scanner;
import Operaciones.Operaciones;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la nota del alumno: ");
        float nota = entrada.nextFloat();
        
        //Llamada al módulo Calificaciones(nota)
        Operaciones.Calificaciones(nota);
    }
    
}
