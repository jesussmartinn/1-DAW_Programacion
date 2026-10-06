/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        //Declaramos las variables y recogemos por teclado el numero que nos proporciona el cliente
        System.out.println("Introduzca un número para calcular su tabla de multiplicar: ");
        int n = num.nextInt();
        int i;
        
        //Realizo el bucle para mostrar las operaciones correctas
        for(i = 0; i <= 10; i++){
            System.out.println( n + " * " + i + " = " + n * i);
        }
    }
    
}
