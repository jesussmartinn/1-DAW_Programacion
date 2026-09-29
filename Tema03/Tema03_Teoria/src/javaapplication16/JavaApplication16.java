/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author alumno
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 3;
        
        //IF. En este caso no funciona, es solo prueba
        System.out.println("IF");
        if(num1 % 2 == 0){
            System.out.println(num1 + " es un número par");
        }
                
        //ELSE
        if(num1 % 2 == 0){
            System.out.println(num1 + " es un número par");
        }
        else{
            System.out.println(num1 + " no es un número par");
        }
        
        //IF-ELSE IF-ELSE
        System.out.println("\nIF - ELSE IF - ELSE");
        if(num1 > 0){
            System.out.println("El número es positivo");
        }
        else if(num1 < 0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }
        
        //SWITCH
        System.out.println("\nSWITCH");
        switch(num1){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No existe ese día de la semana.");
        }
        
        
    }
    
}
