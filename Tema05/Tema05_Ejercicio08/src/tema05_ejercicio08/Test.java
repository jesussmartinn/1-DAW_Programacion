/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio08;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {
    
    //Método que pide un número y lo devuelve
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();
        
        return num;
    }
    
    //Método que recibe un objeto Numero y dice si su valor es par o impar
    public static void mostrarParidad(Numero numero){
        if((numero.getValor() % 2) == 0){
            System.out.println("El número " + numero.getValor() + " es par");
        }
        else{
            System.out.println("El número " + numero.getValor() + " es impar");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Numero numero;
        
        //Pedimos el número al usuario
        n = pedirNumero();
        
        //Creamos el objeto con el número introducido como valor
        numero = new Numero(n);
        
        //Vemos si es par o impar
        mostrarParidad(numero);
    }
    
}
