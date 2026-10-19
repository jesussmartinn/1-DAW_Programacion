/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_teoria;
import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author User
 */
public class Tema04_Teoria {
    /**
     * Método que imprime por pantalla "Hola, mundo".
     */
    public static void saludar(){
        System.out.println("Hola, mundo");
    }
    
    /**
     * Método que pide un número al usuario.
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribre un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que recibe dos numeros enteros por parámetros y los multiplica.
     * @param num1
     * @param num2
     * @return El resultado
     */
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamo al método saludar.
        saludar();
        
        //Llamo al método pedirNumero() dos veces
        //y guardo los valores recibidos en dos variables
        //(Reutilizo el método porque qiuero hacer dos veces lo mismo)
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        /**
         * Llamo al método multiplicar(num1, num2) y lo guardo en una variable 
         */
        int producto = multiplicar(num1, num2);
        //Imprimo el resultado
        System.out.println("El resultado es: " + producto);
        
        //Forma más avanzada:
        int productoAvanzado = multiplicar(pedirNumero(), pedirNumero());
        System.out.println("El resultado avanzado es: " + productoAvanzado);
        
        /**
         * Llamo al método sumar() de la clase operaciones, que está en el paquete operaciones
         */
        Operaciones.sumar(num1, num2);
    }
    
}
