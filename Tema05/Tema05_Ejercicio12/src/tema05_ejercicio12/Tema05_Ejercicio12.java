/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio12 {

    //Método que pide la longitud de un cateto al usuario y la devuelve
    public static double pedirCateto(int posicion) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca al longitud del cateto " + posicion + ": ");
        double longitud = entrada.nextDouble();

        return longitud;
    }

    //Método que calcula y devuelve la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(Triangulo triangulo) {
        double hipotenusa;

        hipotenusa = Math.sqrt(Math.pow(triangulo.getCateto1(), 2)
                + Math.pow(triangulo.getCateto2(), 2));

        return hipotenusa;
    }

    //Método que muestra por pantalla el resultado
    public static void mostrarResultado(Triangulo triangulo, double hipotenusa) {
        System.out.println("La hipotenusa del triángulo de catetos "
                + triangulo.getCateto1() + " y " + triangulo.getCateto2()
                + " es: " + hipotenusa);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        Triangulo triangulo;
        
        //Pedimos la longitud de los catetos
        cateto1 = pedirCateto(1);
        cateto2 = pedirCateto(2);
        
        //Creamos el objeto pasándole los catetos al constructor
        triangulo = new Triangulo(cateto1, cateto2);
        
        //Calculamos la hipotenusa y mostramos el resultado
        hipotenusa = calcularHipotenusa(triangulo);
        mostrarResultado(triangulo, hipotenusa);
    }
}
