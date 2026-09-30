/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio02;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un número: ");
        int num1 = numeros.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        int num2 = numeros.nextInt();
        
        int res;
        
        if(num1 > 10){
            res = num1 * num2;
            System.out.println("La operación que se realizó es producto "
                    + "y el resultado es: " + res);
        }
        else{
            res = num1 + num2;
            System.out.println("La operación que se realizó es suma "
                    + "y el resultado es: " + res);
        }
    }
    
}
