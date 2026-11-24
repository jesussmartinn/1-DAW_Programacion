/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema05_ejercicio17;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    //Constante con los puntos que vale cada pregunta acertada
    final static double PUNTOS = 2.5;

    //Método que hace una pregunta al usuario, le dice si ha acertado y devuelve si ha acertado
    public static boolean preguntar(Enunciado enunciado) {
        Scanner teclado = new Scanner(System.in);

        System.out.print(enunciado.getPregunta() + " ");
        String respuestaUsuario = teclado.nextLine();

        boolean acierto = respuestaUsuario.equalsIgnoreCase(enunciado.getRespuesta());

        if (acierto) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + enunciado.getRespuesta());
        }

        return acierto;
    }

    //Método que calcula y devuelve la nota según el número de aciertos
    public static double calcularNota(int aciertos) {
        double nota;

        nota = aciertos * PUNTOS;

        return nota;
    }

    //Método que muestra por pantalla el resultado final del examen
    public static void mostrarNota(int aciertos, double nota) {
        System.out.println("Has acertado " + aciertos + " preguntas.");
        System.out.println("Tu nota del examen es: " + nota);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aciertos = 0;
        double nota;

        //Creamos las cuatro preguntas
        Enunciado preg1 = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        Enunciado preg2 = new Enunciado("¿Cuál es la capital de Italia?", "Roma");
        Enunciado preg3 = new Enunciado("¿En qué ciudad está la Sagrada Familia?", "Barcelona");
        Enunciado preg4 = new Enunciado("¿Cuál es el animal terrestre más grande?", "Elefante");

        //Hacemos cada pregunta y sumamos un acierto si responde bien
        if (preguntar(preg1)) {
            aciertos++;
        }
        if (preguntar(preg2)) {
            aciertos++;
        }
        if (preguntar(preg3)) {
            aciertos++;
        }
        if (preguntar(preg4)) {
            aciertos++;
        }

        //Calculamos la nota y la mostramos
        nota = calcularNota(aciertos);
        mostrarNota(aciertos, nota);
    }
    
}
