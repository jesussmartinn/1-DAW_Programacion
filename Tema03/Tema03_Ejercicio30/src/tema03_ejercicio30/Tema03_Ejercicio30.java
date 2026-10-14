/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio30;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int contador = 0;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            contador++;
            
            try {
                intento = scanner.nextInt();
                
                if (intento > numeroSecreto) {
                    System.out.println("El número es menor.");
                } else if (intento < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("¡Correcto! Has adivinado el número.");
                    System.out.println("Número de intentos: " + contador);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero. Contabilizado como intento.");
                scanner.next(); 
            }
        }
    }
}
