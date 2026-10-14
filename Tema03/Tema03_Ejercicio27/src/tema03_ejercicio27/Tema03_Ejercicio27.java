/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio27;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        int opcion = 0;
        
        while (opcion != 5) {
            System.out.println("\nMENÚ:");
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    try {
                        int division = num1 / num2;
                        System.out.println("División: " + division);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
