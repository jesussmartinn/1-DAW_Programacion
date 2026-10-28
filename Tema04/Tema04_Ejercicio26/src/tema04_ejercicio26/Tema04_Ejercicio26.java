/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio26;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio26 {

    /**
     * Método para pedir un número por teclado al usuario
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();
        
        return num;
    }
    
    
    public static Boolean esPrimo(int num){
      
        if(num < 2){
            return false;
        }
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = pedirNumero();
        
        if(esPrimo(num)){
            System.out.println(num + " es un número primo.");
        }else{
            System.out.println(num + " no es un número primo.");
        }
    }
}
