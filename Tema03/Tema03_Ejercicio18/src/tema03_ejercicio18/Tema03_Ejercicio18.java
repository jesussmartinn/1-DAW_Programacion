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
        
        int i = 0;
        int contrCorrecta = 1234;
        int contr;
        
        do{
            System.out.println("Escriba la contraseña de 4 dígitos: ");
            contr = contrasena.nextInt();
            
            if(i > 3 || contr != contrCorrecta){
                System.out.println("Error");
            }else{
                System.out.println("Enhorabuena");
            }
            
        }while(i > 3 || contr != contrCorrecta);
    }
    
}
