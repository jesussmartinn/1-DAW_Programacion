/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio06;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca una nota entre 0 y 10: ");
        float nota = notas.nextFloat();
        
        if(nota > 0 && nota < 5){
            System.out.println("Suspenso");
        }
        else if(nota > 5 && nota < 7){
            System.out.println("Bien");
        }
        else if(nota > 7 && nota < 9){
            System.out.println("Notable");
        }
        else if(nota > 9 && nota < 10){
            System.out.println("Sobresaliente");
        }
        else if(nota < 0 || nota > 10){
            System.out.println("Error. Has introducido una nota que no está entre 0 y 10");
        }
    }
    
}
