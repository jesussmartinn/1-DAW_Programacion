/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio26;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema02_Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cifras = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        int num = cifras.nextInt();
        
        int n1 = num / 1000;
        int n2 = (num / 100) % 10;
        int n3 = (num /10) % 10;
        int n4 = num % 10;
        
        System.out.println("La primera cifra es: " + n1);
        System.out.println("La segunda cifra es: " + n2);
        System.out.println("La tercera cifra es: " + n3);
        System.out.println("La cuarta cifra es: " + n4);
    }
    
}
