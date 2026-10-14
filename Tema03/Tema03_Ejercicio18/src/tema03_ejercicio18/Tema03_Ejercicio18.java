/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    
    final static int CLAVE = 1234;
    
    public static void main(String[] args) {
        Scanner contrasena = new Scanner(System.in);
        
        //Declaro e inicializo las variables
        int intento;
        int numIntentos = 0;
        
        do{
            //Lectura de la contraseña que se escriba por teclado
            System.out.println("Escriba la contraseña de 4 dígitos: ");
            intento = contrasena.nextInt();
            
            //Se incrementa el número de intentos
            numIntentos++;
        
        //Declaración del while    
        }while(numIntentos < 3 && intento != CLAVE);
        
        //Compruebo si acertó o agotó los intentos
        if(intento == CLAVE){
            System.out.println("Enhorabuena, has acertado la contraseña");
        }
        else{
            System.out.println("Error, has agotado el límite de intentos");
        }
    }
}
