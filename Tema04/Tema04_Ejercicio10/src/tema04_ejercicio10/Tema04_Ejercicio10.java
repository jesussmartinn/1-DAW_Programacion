/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio10;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tema04_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    
    
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
    
    public static void tabla(int num){
        int res;
        for(int i = 0; i<11; i++){
            res = num * i;
            System.out.println(num + " * " + i + " = " + res);
        }
    }
    
    public static void main(String[] args) {
        int num = pedirNumero();
        tabla(num);
    }
    
}
