/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03_ejercicio26;

/**
 *
 * @author User
 */
public class Tema03_Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        
        for(int i = 111; i < 222; i++){
            if(i % 2 == 1){
                suma = suma + i;
            }
        }
        System.out.println("La suma de los números impares entre 111 y 222 es: " + suma);
    }
    
}
