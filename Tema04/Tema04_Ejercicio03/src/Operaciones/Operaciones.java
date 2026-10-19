/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author User
 */
public class Operaciones {
    
    /**
     * Método que compara 3 números e imprime por pantalla el mayor.
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void Mayor(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor de los introducidos es el " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El mayor de los introducidos es el " + num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("El mayor de los introducidos es el " + num3);
        }
    }
}
