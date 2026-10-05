/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema03;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        
        //WHILE
        System.out.println("WHILE");
        while(i<10){
            System.out.println(i);
            i++;
        }
        
        //DO WHILE
        System.out.println("DO WHILE");
        do{
            System.out.println(i);
            i++;
        }while(i<10);
        
        //FOR
        System.out.println("FOR");
        for(i=0; i<10; i++){
            System.out.println(i);
        }
        
        //MENÚS
        int opc = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            //MOSTRAMOS EL MENÚ AL USUARIO
            System.out.println("1. Ver cátologo");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            
            //PEDIR LA OPCIÓN
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Has elejido ver el cátologo.");
                    break;
                case 2:
                    System.out.println("Has elegido solicitar un libro");
                case 3:
                    System.out.println("Has elegido devolver un libro");
                case 4:
                    System.out.println("Gracias por usar nuestro programa");
            }
        }while(opc != 4);
    }
    
}
