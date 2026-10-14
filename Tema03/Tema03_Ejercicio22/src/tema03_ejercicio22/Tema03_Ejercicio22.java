/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio22;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema03_Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el primer número: ");
            double numero1 = num.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double numero2 = num.nextDouble();

            double suma = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + suma);
            
        } catch (Exception e) {
            System.out.println("Error: Has introducido una letra o carácter no válido en vez de un número.");
        }
    }
    
}
