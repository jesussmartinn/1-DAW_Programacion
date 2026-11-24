/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio12;

/**
 *
 * @author User
 */
public class Triangulo {
    //ATRIBUTOS
    private double cateto1;
    private double cateto2;
    
    //CONSTRUCTORES
    //Por defecto
    public Triangulo(){
        this.cateto1 = 0.0;
        this.cateto2 = 0.0;
    }
    
    //Parametrizado
    public Triangulo(double cateto1, double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    //GETTERS Y SETTERS
    
    public double getCateto1(){
        return cateto1;
    }
    
    public void setCateto1(double cateto1){
        this.cateto1 = cateto1;
    }
    
    public double getCateto2(){
        return cateto2;
    }
    
    public void setCateto2(double cateto2){
        this.cateto2 = cateto2;
    }
}
