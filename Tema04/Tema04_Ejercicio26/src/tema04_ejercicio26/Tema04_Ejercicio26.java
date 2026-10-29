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
    
    /**
     * Método que devuelve si un número es primo o no
     * @param num
     * @return 
     */
    public static Boolean esPrimo(int num){
      
        //Si el número es menor que dos, devuelve false directamente
        if(num < 2){
            return false;
        }
        
        //Si encuentra un número que se pueda dividir entonces ya no es un
        //número primo, se devueve false
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        //Si no encuentra ningun número que se pueda dividir entonces es un
        //número primo, se devuelve true
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
