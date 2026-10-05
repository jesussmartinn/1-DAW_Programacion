/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema03_Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 20; 
        int total = 0;
        
        System.out.println("Los números impares existentes entre el número 20 y "
                + " el 160 son: ");
        while(i >= 20 && i <= 160){
            if(i % 2 == 1){
                System.out.println(i);
                i++;
                total++;
            }
            else{
                i++;
            }
        }
        System.out.println("La cantidad de números impares impresos han sido: "
        + total);
    }
    
}
