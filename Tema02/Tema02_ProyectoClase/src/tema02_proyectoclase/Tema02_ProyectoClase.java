package tema02_proyectoclase; //Paquete al que pertenece mi clase

//Importamos la clase Scanner con la secuencia import
import java.util.Scanner; // Con esto incluyes Scanner dentro del paquete util
import java.util.*; //Con esto incluyes todo el paquete util

/**
 * Clase principal de repaso del tema 2. 
 * @author alumno
 */
public class Tema02_ProyectoClase {
    //VARIABLES (Globales)
    static int vida = 100;
    
    //CONSTANTES
    final static float GRAVEDAD = 9.8f;

    //METODOS
    public static void atacar(){
        int danio = 5; //Variable local
        System.out.println("La vida del heroe ahora es de : " + (vida - danio));
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        System.out.println("La vida del heroe es: " + vida);
        
        System.out.println("La gravedad es: " + GRAVEDAD);
        
        //VARIABLES (Locales porque estan dentro del metodo main)
        //Enteros: (ordenados de menor a mayor capacidad)
        byte edad;
        short distancia = 100;
        int numMatricula = 2543;
        long numAlumnos = 30;
        
        //Decimales
        float altura = 1.7f;
        double peso = 10.5;
        
        //Booleanos
        boolean esEnReposo = true;
        
        //Caracteres
        char letra = 'A'; //Solo puede almacenar 1 caracter. Va con comillas simples.
     
        
        System.out.println("¿Es la variable distancia un numero par?");
        int resto = distancia % 2;
        boolean esPar = distancia %2 == 0;
        System.out.println(resto);        
        System.out.println(esPar);
        
        
        //CASTING (Conversión de tipos de datos)
        int num1 = 1;
        short num2 = 2;
        
        //Conversión implícita
        num1 = num2;
        
        //Conversión explícita
        num1 = num2;
        num2 = (short)num1;
        
        
        
        //ENTRADA DE DATOS POR TECLADO
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu edad: ");
        int edad2 = entrada.nextInt();
        
        System.out.println("Tu edad es " + edad2);
        
        
        
        
        
    }
    
}
