/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio09;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio09 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = Operaciones.pedirNumero("Por favor, introduzca el primer número: ");
       int num2 = Operaciones.pedirNumero("Ahora, introduzca el segundo número: "); 
       int num3 = Operaciones.pedirNumero("Por último, introduzca un tercer número: ");
       
       Operaciones.menor(num1, num2, num3);  
    }
    
}
