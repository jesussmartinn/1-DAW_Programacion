/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio01;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        int num = numero.nextInt();
        
        if(num > 0){
            System.out.println(num + " es un número positivo");
        }
        else{
            System.out.println(num + " es un número negativo");
        }
    }
    
}
