/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio17;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio17 {

    /**
     * Método que le pide introducir una letra por teclado al usuario
     * @return 
     */
    public static char pedirLetra(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una letra minúscula: ");
        char letra = entrada.nextLine().charAt(0);
        
        return letra;
    }
    
    /**
     * Método que genera una letra aleatoria
     * @return 
     */
    public static char letraAleatoria(){
        return (char) (Math.random() * 26 + 'a');
    }
    
    /**
     * Método que realiza todas las operaciones del juego
     * @return 
     */
    public static boolean juego(){
        boolean buscar = false;
        int cont = 0;
        char secreta = letraAleatoria();
        char letra;
        
        do{
            letra = pedirLetra();
            cont++;
            
            if(letra == secreta){
                System.out.println("Enhorabuena, has acertado la letra");
                buscar = true;
                cont++;
            }else{
                if(letra < secreta){
                    System.out.println("La letra correcta está después.");
                }else{
                    System.out.println("La letra correcta está antes.");
                }
                System.out.println("Sigue intentando: ");
                cont++;
            }
        }while(!buscar);
        
        System.out.println("Números de intentos realizados: " + cont);
        
        return buscar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        juego();
    }   
}
