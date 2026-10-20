/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio02;
import java.util.Scanner;
import operaciones.Multiplicar;
import operaciones.Sumar;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos dos valores al usuario y los recogemos en sus variables
        System.out.println("Introduzca un número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        
        /**
         * Realizamos la condición de si el primer número es mayor que 10
         * se realiza la operación de multiplicar, sino se realiza la suma.
         */
        if(num1 > 10){
            Multiplicar.multiplicacion(num1, num2);
        }else{
            Sumar.suma(num1, num2);
        }
    }
}
