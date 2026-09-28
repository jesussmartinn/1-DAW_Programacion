/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_ejercicio13;

/**
 *
 * @author alumno
 */
public class Tema02_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int aux;
        
        aux = num1;
        num1 = num2;
        num2 = aux;
        
        System.out.println("La variable num1 contiene el valor 1 y la "
                + "variable num2 contiene el valor 2");
        System.out.println("Ahora, la variable contiene el valor " + num1 + 
                " y la variable num2 contiene el valor " + num2);
    }
    
}
