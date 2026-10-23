/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio01;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio01 {
    
    /**
     * Método que resuelve su un número es positivo, negativo o es cero.
     * @param num 
     */
    public static void numerosEnteros(int num){
        if(num > 0){
            System.out.println("El número introducido es positivo");
        }else if(num < 0){
            System.out.println("El número introducido es negativo");
        }else{
            System.out.println("El número introducido es cero");
        }
    }
    
    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirNumero(){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario un número por pantalla
        System.out.println("Por favor, introduzca un número: ");
        int num = entrada.nextInt();
        
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos al método pedirNumero()
        int num = pedirNumero();
        //Llamamos al método numerosEnteros(num)
        numerosEnteros(num);   
    }
    
}
