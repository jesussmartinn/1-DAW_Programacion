/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio25;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio25 {

    
    public static double pedirNumero(String mensaje){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(mensaje);
        double numero = entrada.nextDouble();
        
        return numero;
    }
    
    
    public static double potencia(double base, double exp){
        if(base == 0 && exp < 0){
            throw new ArithmeticException("0 elevado a un número negativo es infinito.");
        }
        return Math.pow(base, exp);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base = pedirNumero("Introduzca la base: ");
        double exp = pedirNumero("Introduzca el exponente: ");

        try{
            double res = potencia(base, exp);
            System.out.println(base + " elevado a " + exp + " es: " + res);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
