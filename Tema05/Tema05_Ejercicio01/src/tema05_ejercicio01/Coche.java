/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Coche {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private Boolean motorEncendido = false;
    
    //Setters
    public void setMarca(String m){
        marca = m;
    }
    
    public void setModelo(String md){
        modelo = md;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void setVelocidad(int v){
        velocidad = v;
    }
    
    public void setMotorEncendido(Boolean motor){
        motorEncendido = motor;
    }
    
    //Getters
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public Boolean getMotorEncendido(){
        return motorEncendido;
    }
    
    //Métodos
    
    public String establecerMarca(String m){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la marca del coche: ");
        m = entrada.nextLine();
        
        return m;
    }
    
    public String establecerModelo(String md){
       Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el modelo del coche: ");
        md = entrada.nextLine();
        
        return md;
    }
    
    public String establecerColor(String c){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el color del coche: ");
        c = entrada.nextLine();
        
        return c;
    }
    
    public void arrancarCoche(Boolean motorEncendido,int velocidad){
        motorEncendido = true;
        velocidad = 10;
        
        System.out.println("El motor esta encendido.");
    }
    
    public void apagarCoche(Boolean motorEncendido,int velocidad){
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche(int velocidad){
        velocidad = velocidad + 20;
        
        System.out.println("La velocidad actual es: " + velocidad);
    }
    
    public void frenarCoche(int velocidad){
        if(velocidad > 0){
            velocidad = velocidad - 6;
            System.out.println("La velocidad actual es: " + velocidad);
        }else{
            System.out.println("El coche no esta encendido");
        }
    }
    
    public void obtenerEstado(){
        System.out.println("Marca: " + getMarca() + " - Modelo: " + getModelo() + 
                " - Color: " + getColor() + " - Velocidad: " + getVelocidad() + 
                " - Motor encendido: " + getMotorEncendido());
    }
}
