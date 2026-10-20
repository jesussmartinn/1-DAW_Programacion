/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio07;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio07 {

    
        /**
     * Método que ordena los 4 números introducidos de menor a mayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void Orden(int num1, int num2, int num3, int num4){
        int aux;
       
        for(int i = 0; i < 3; i++){
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
        }
        System.out.println("El orden de los numeros introducidos es: " + num1 + " - " +
                num2 + " - " + num3 + " - " + num4);
    }


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Solicitamos la entrada por teclado de los 3 números
        //y las recogemos en sus respectivas variables
        System.out.println("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        
        System.out.println("Introduzca el cuarto número: ");
        int num4 = entrada.nextInt();
        
        //Llamada al módulo Orden(num1, num2, num3, num4)
        Tema04_Ejercicio07.Orden(num1, num2, num3, num4);
    }
}