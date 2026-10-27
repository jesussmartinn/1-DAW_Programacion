/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio16;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raiz = 64;
        
        int base = 8, exponente = 3;
        
        double exponencial = 2;
        
        double logaritmo = 2.1828;
        
        double valor1 = 2, valor2 = 3;
        
        double abs = -4.5;
        
        double seno = 45;
        
        //Raíz cuadrada de 64
        System.out.println("La raíz cuadrada de 64 es: " + Math.sqrt(raiz));

        //8 elevado al cubo
        System.out.println("8 elevado al cubo es: " + Math.pow(base, exponente));
        
        //Exponencial de 2
        System.out.println("El exponencial de 2 es: " + Math.exp(exponencial));
        
        //Logaritmo de 2,71828
        System.out.println("El logaritmo de 2,71828 es: " + Math.log(logaritmo));
        
        //Menor valor entre 2 y 3
        System.out.println("El menor valor entre 2 y 3 es: " + Math.min(valor1, valor2));
        
        //Valor absoluto de -4,5
        System.out.println("El valor absoluto de -4,5 es: " + Math.abs(abs));
        
        //Redondeando a -4.5 con ROUND
        System.out.println("Redondeando a -4,5 con ROUND es : " + Math.round(abs));
        
        //Seno de 45º
        System.out.println("El seno de 45º es: " + Math.sin(abs));
    }   
}
