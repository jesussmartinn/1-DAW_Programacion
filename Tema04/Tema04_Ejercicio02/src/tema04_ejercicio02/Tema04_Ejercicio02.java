/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio02;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio02 {

    
    /**
     * Método que devuelve el número que introduzca el usuario por teclado
     * @return 
     */
    public static int pedirNumero(String mensaje){
        //Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario dos número por pantalla
        System.out.println(mensaje);
        int num = entrada.nextInt();
        
        return num;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = pedirNumero("Por favor, introduzca el primer número: ");
        int num2 = pedirNumero("Ahora, introduzca el segundo número: ");
        
        if(num1 > 10){
            Operaciones.multiplica(num1,num2);
        }else{
            Operaciones.suma(num1, num2);
        }
    }
    
}
