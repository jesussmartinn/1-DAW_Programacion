/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author User
 */
public class Operaciones {
    
    /**
     * Método que ordena los 4 números introducidos de menor a mayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void Orden(int num1, int num2, int num3, int num4){
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
