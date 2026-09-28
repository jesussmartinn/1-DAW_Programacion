/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema02_reto_elcreadordepersonajes;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema02_Reto_ElCreadorDePersonajes {
    
    final static int VIDA_POR_NIVEL = 20;
    final static int XP_POR_NIVEL = 200;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca la letra inicial: ");
        char letraInicial = letra.next().charAt(0);
        
        Scanner atributos = new Scanner(System.in);
        Scanner alt = new Scanner(System.in);
        
        System.out.println("Introduzca la edad: ");
        int edad = atributos.nextInt();
        
        System.out.println("Introduzca la altura: ");
        double altura = alt.nextDouble();
        
        System.out.println("Introduzca el nivel: ");
        int nivel = atributos.nextInt();
        
        System.out.println("Introduzca la vida inicial: ");
        int vidaInicial = atributos.nextInt();
        
        System.out.println("Por último, introduzca la experiencia: ");
        int exp = atributos.nextInt();
        
        
        
    }
    
}
