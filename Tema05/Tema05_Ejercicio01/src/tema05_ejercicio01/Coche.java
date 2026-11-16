/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio01;

/**
 *
 * @author User
 */
public class Coche {
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
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerModelo(String md){
        modelo = md;
    }
    
    public void establecerColor(String c){
        color = c;
    }
    
    public void arrancarCoche(Boolean motorEncendido,int velocidad){
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarCoche(Boolean motorEncendido,int velocidad){
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche(int velocidad){
        velocidad = velocidad + 20;
    }
    
    public void frenarCoche(int velocidad){
        if(velocidad > 0){
            velocidad = velocidad - 6;
        }else{
            System.out.println("El coche no esta encendido");
        }
    }
    
    public void obtenerEstado(){
        getMarca();
        getModelo();
        getColor();
        getVelocidad();
        getMotorEncendido();
    }
}
