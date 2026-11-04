/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ColaDeCorreos {
    
    /**
     * Método que genera un numero aleatorio entre 0 y 100
     * y lo imprime por pantalla como número de envío
     */
    public static int enviar(){
        int numEnvio = (int)(Math.random() * 101);
        System.out.println("E-" + numEnvio);
        
        return numEnvio;
    }
    
    /**
     * Método que genera un numero aleatorio entre 0 y 100
     * y lo imprime por pantalla como número de recogida
     */
    public static int recoger(){
        int numRecogida = (int)(Math.random() * 101);
        System.out.println("R-" + numRecogida);
        
        return numRecogida;
    }
    
    
    public static String tipoTicket(String mensaje){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(mensaje);
        String tipo = entrada.nextLine();
        
        return tipo;
    }
    
    public static String generarLoteTickets(){
        String tipo;
       
        tipo = tipoTicket("Enviar o recoger");
        System.out.println("Usted ha seleccionado: " + tipo);
        return tipo;
    }
    
    
    public static int pedirCantidadTickets(){
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;
        
        try{
            System.out.println("Introduzca el número de tickets a generar: ");
            cantidad = entrada .nextInt();
            
            for(int i = 1; i <= cantidad; i++){
                if(i % 3 == 0){
                    System.out.println("La cantidad de ticket generados son: " + cantidad);
                }else{
                    throw new ArithmeticException("Debe ser un número múltiplo de 3");
                }
            }
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return cantidad;
    }
    
    public static void ticketSolicitados(String tipo, int cantidad){
        tipo = tipoTicket("Enviar o Recoger");
        cantidad = pedirCantidadTickets();
               
        int total = 0;
        
        if(tipo == "Enviar"){
            for(int i = 1; i <= cantidad; i ++){
                total = total + enviar();
            }
        }else{
            for(int i = 1; i <= cantidad; i ++){
                total = total + recoger();
            }
        }
        
        System.out.println("Se han pedido " + cantidad + " del tipo de ticket " + tipo);
        System.out.println("Estos son los tickets: " + total);
    }
    
    public static int pedirOpcion(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce una opción: ");
        int opcion = entrada.nextInt();
        
        return opcion;
    }
    
    public static void menu(){
        int opcion = 0;
        
        while (opcion != 4) {
           
            System.out.println("MENÚ:");
            System.out.println("1.- Enviar");
            System.out.println("2.- Recoger");
            System.out.println("3.- Generar lote de tickets");
            System.out.println("4.- Salir");
            
            System.out.print("Elige una opción: ");
            
            opcion = pedirOpcion();

            switch (opcion) {
                case 1:
                    System.out.println(enviar());
                    break;
                case 2:
                    System.out.println(recoger());
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;      
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menu();
        
    }
    
}
