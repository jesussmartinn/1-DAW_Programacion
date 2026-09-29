/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio04;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = numeros.nextInt();
        System.out.println("Ahora, introduzca el segundo número: ");
        int num2 = numeros.nextInt();
        System.out.println("Por útlimo, introduzca el tercer número: ");
        int num3 = numeros.nextInt();
        
        if(num1 < num2 && num1 < num3){
            System.out.println("El número mayor de los introducidos es el: " + num1);
        }
        else if(num2 < num1 && num2 < num3){
            System.out.println("El número mayor de los introducidos es el: " + num2);
        }
        else if(num3 < num1 && num3 < num2){
            System.out.println("El número mayor de los introducidos es el: " + num3);
        }
    }
    
}
