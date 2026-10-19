/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author User
 */
public class Operaciones {
    
    public static void Calificaciones(float nota){
        if(nota > 0 && nota < 5){
            System.out.println("Suspenso");
        }else if(nota > 5 && nota < 7){
            System.out.println("Bien");
        }else if(nota > 7 && nota < 9){
            System.out.println("Notable");
        }else if(nota > 9 && nota <10){
            System.out.println("Sobresaliente");
        }else if(nota < 0 || nota > 10){
            System.out.println("ERROR");
        }
    }
}
