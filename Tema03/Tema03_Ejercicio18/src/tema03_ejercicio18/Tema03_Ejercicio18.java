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
    public static void main(String[] args) {
        Scanner contrasena = new Scanner(System.in);
        
        int contrCorrecta = 1234;
        int intento;
        int numIntentos = 0;
        
        do{
            System.out.println("Escriba la contraseña de 4 dígitos: ");
            intento = contrasena.nextInt();
            
            numIntentos++;
            
        }while(numIntentos < 3 && intento != contrCorrecta);
        
        //Compruebo si acertó o agotó los intentos
        if(intento == contrCorrecta){
            System.out.println("Enhorabuena, has acertado la contraseña");
        }
        else{
            System.out.println("Error, has agotado el límite de intentos");
        }
    }
}
