/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio21;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema03_Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int resultado; 
        
        try {
            System.out.print("Introduce el dividendo: ");
            int numero1 = num.nextInt();

            System.out.print("Introduce el divisor: ");
            int numero2 = num.nextInt();

            resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
            
        } catch (ArithmeticException e) {
            // Captura el error al dividir por 0
            System.out.println("Error: No se puede dividir por 0 " );
        }
    }
}
