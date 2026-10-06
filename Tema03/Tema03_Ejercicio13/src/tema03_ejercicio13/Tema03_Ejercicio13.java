/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio13;

/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro e inicializo la variable
        int i = 11;
        
        //Hago el bucle para que salgan los números pares entre 11 y 133
        while(i < 133){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
