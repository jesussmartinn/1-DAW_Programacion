/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio13;

/**
 *
 * @author User
 */
public class Tema05_Ejercicio13 {

    //Constante con el número de veces que se muestra el saludo
    final static int VECES = 5;

    //Método que crea un objeto Saludo con la frase indicada y lo devuelve
    public static Saludo crearSaludo(String frase) {
        Saludo saludo = new Saludo(frase);

        return saludo;
    }

    //Método que muestra por pantalla la frase del saludo una vez
    public static void mostrarSaludo(Saludo saludo) {
        System.out.println(saludo.getFrase());
    }

    //Método que muestra por pantalla el saludo tantas veces como se indique
    public static void repetirSaludo(Saludo saludo, int veces) {
        for (int i = 0; i < veces; i++) {
            mostrarSaludo(saludo);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saludo saludo;

        //Creamos el saludo
        saludo = crearSaludo("Hola, que tal");

        //Lo mostramos cinco veces
        repetirSaludo(saludo, VECES);
    }
    
}
