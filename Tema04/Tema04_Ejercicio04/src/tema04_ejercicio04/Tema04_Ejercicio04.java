/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio04;
import java.util.Scanner;
import Operaciones.Operaciones;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Solicitamos la entrada por teclado de los 3 números
        //y las recogemos en sus respectivas variables
        System.out.println("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        
        //Llamada al módulo Menor(num1, num2, num3)
        Operaciones.Menor(num1, num2, num3);
    }
}