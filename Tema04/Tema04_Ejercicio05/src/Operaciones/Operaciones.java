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
     * Método que dado un número, indica si es par o impar
     * @param num 
     */
    public static void Paridad(int num){
        if(num % 2 == 0){
            System.out.println("El número " + num + " es par");
        }else{
            System.out.println("El número " + num + " es impar");
        }
    }
}
