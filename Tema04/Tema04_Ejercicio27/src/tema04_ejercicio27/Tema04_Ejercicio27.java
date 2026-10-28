/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04_ejercicio27;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tema04_Ejercicio27 {

    /**
     * Método que pide al usuario que elija cara o cruz.
     * Si introduce otra cosa, se lo vuelve a pedir.
     * @return la elección del usuario en minúsculas ("cara" o "cruz")
     */
    public static String pedirEleccion(){
        Scanner entrada = new Scanner(System.in);
        String eleccion;
        
        do{
            System.out.println("Elegir cara o cruz: ");
            eleccion = entrada.nextLine().toLowerCase();
        }while(!eleccion.equalsIgnoreCase("cara") && !eleccion.equalsIgnoreCase("cruz"));
        
        return eleccion;
    }
    
    /**
    * Método que simula el lanzamiento de una moneda generando aleatoriamente
    * cara o cruz.
    * @return el resultado del lanzamiento ("cara" o "cruz")
    */
    public static String lanzarMoneda(){
        String resA;
        
        /** Math.random() da un decimal entre 0 y 0,99; al multiplicar por 2
        * queda entre 0 y 1,99 y con (int) se quitan los decimales: 0 o 1
        **/
        int num = (int) (Math.random() * 2);
        
        if(num== 0){
            resA = "cara";
        }else{
            resA = "cruz";
        }
        
        return resA;
    }
    
    /**
    * Método que pide la elección al usuario, lanza la moneda,
    * muestra el resultado e indica si ha acertado.
    * Se repite hasta que el usuario acierte.
    */
    public static void jugar(){
        String eleccion;
        String resA;
        
        do{
            eleccion = pedirEleccion();
            resA = lanzarMoneda();
            
            System.out.println("Ha salido " + resA);
            
            if(eleccion.equals(resA)){
                System.out.println("Enhorabuena, has acertado");
            }else{
                System.out.println("Has perdido. Vuelve a intentarlo");
            }
        }while(!eleccion.equalsIgnoreCase(resA));
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        jugar();
    }
    
}
