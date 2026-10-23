/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio11;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio11 {

  
    
    public static double pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        double num;
        do {
           System.out.print("Introduzca un número para calcular su raíz cuadrada: ");
           num = entrada.nextDouble();
           if (num < 0) {
               System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
           }
        } while (num< 0);
        return num;
    }
    
    /**
     * Método que cálcula la raíz cuadrada
     * @param numero
     * @return 
     */
    public static double calcularRaiz(double num) {
        return Math.sqrt(num);
    }
    
    /**
     * Método que muestra el resultado obtenido
     * @param num
     * @param raiz 
     */
    public static void muestraResultado(double num, double raiz) {
        System.out.println("La raíz cuadrada de " + num + " es " + raiz);
    }
    
    /**
    * @param args the command line arguments
    */       
    public static void main(String[] args) {
        double num = pedirNumero();
        double raiz = calcularRaiz(num);
        muestraResultado(num,raiz);
        
    }
    
}
