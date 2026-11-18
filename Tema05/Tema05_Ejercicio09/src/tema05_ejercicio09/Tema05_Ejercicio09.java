/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio09;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio09 {

    //Método que pide un número al usuario, crea un objeto Numero con él y lo devuelve
    public static Numero pedirNumero(int posicion){
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.print("Introduzca el número " + posicion + ": ");
        valor = teclado.nextInt();
        
        return new Numero(valor);
    }
    
    //Método que recibe dos objetos Numero y devuelve el que tenga mayor valor
    public static Numero mayorDeDos(Numero a, Numero b){
        Numero mayor;
        
        if  (a.getValor() > b.getValor()){
            mayor = a;
        }
        else{
            mayor = b;
        }
        
        return mayor;
    }
    
    //Método que recibe tres objetos Numero y devuelve el mayor de ellos
    public static Numero mayorDeTres(Numero a, Numero b, Numero c){
        Numero mayor;
        
        mayor = mayorDeDos(a, b);
        mayor = mayorDeDos(mayor, c);
        
        return mayor;
    }
    
    //Método que muestra por pantalla el número con mayor valor
    public static void mostrarMayor(Numero mayor){
        System.out.println("El mayor de los tres números es: " + mayor.getValor());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero n1, n2, n3, mayor;
        
        //Pedimos los tres números (cada uno es un objeto)
        n1 = pedirNumero(1);
        n2 = pedirNumero(2);
        n3 = pedirNumero(3);
        
        //Calculamos el mayor y lo mostramos
        mayor = mayorDeTres(n1, n2, n3);
        mostrarMayor(mayor);
    }
    
}
