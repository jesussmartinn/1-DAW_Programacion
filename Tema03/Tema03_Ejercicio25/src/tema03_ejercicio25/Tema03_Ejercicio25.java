/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio25;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        
        for(int i = 17; i < 239; i++){
            if(i % 2 == 0){
                suma = suma + i;
            }
        }
        System.out.println("La suma de los números pares entre 17 y 239 es: " + suma);
    }
    
}
