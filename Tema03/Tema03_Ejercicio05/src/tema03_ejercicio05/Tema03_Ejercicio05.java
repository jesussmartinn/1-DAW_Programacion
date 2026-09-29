/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio05;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un número: ");
        int num1 = numero.nextInt();
        
        if(num1 % 2 == 0){
            System.out.println(num1 + " es par");
        }
        else{
            System.out.println(num1 + " es impar");
        }   
    }
    
}
