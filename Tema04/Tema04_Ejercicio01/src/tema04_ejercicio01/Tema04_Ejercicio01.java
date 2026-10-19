/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio01;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio01 {
    
    
    public static void numerosEnteros(int num){
        if(num > 0){
            System.out.println("El número introducido es positivo");
        }else if(num < 0){
            System.out.println("El número introducido es negativo");
        }else{
            System.out.println("El número introducido es cero");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        
        numerosEnteros(num);   
    }
    
}
