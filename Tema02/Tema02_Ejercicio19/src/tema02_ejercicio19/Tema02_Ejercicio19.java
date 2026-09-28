/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio19;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 6, c;
        
        c = a / b;
        System.out.println("El valor de c es: " + c);
        
        c = a % b;
        System.out.println("El valor de c es: " + c);
        
        a++;
        System.out.println("El valor de a es: " + a);
        
        ++a;
        System.out.println("El valor de a es: " + a);
        
        c = ++a + b++;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        
        c = ++a + ++b;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
    }
    
}
