/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio12;

/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 11;
        
       do{
           if(i % 2 == 0){
               System.out.println(i);
               i++;
           }
       }while(i >= 11 && i<= 133);
    }
    
}
