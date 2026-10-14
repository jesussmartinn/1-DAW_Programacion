/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio23;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema03_Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        
        while (numero <= 1) {
            System.out.print("Introduce un número mayor que 1: ");
            numero = scanner.nextInt();
            
            if (numero <= 1) {
                System.out.println("Error: El número debe ser mayor que 1.");
            }
        }
        
        System.out.println("Números entre 1 y " + numero + ":");
        for (int i = 2; i < numero; i++) {
            System.out.print(i + " ");
        }
    }
}
