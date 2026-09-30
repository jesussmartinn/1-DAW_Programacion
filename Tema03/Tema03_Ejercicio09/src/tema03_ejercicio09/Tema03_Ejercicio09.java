/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio09;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = numeros.nextInt();
        System.out.println("Ahora, introduzca un segundo número: ");
        int num2 = numeros.nextInt();
        System.out.println("Introduzca un tercer número: ");
        int num3 = numeros.nextInt();
        System.out.println("Por último, introduzca un cuarto número: ");
        int num4 = numeros.nextInt();
        
        int aux;
        
        // Comparamos el 1º con el 2º
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        // Comparamos el 2º con el 3º
        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        // Comparamos el 3º con el 4º
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }

        // Repetimos el proceso para asegurar que los demás también se ordenen
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        // Última comprobación para los dos primeros
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + " - " +
                num2 + " - " + num3 + " - " + num4);
    }
    
}
