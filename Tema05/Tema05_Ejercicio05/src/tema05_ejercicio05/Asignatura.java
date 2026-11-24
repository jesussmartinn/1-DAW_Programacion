/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio05;

/**
 *
 * @author admin
 */
public class Asignatura {
    //ATRIBUTOS
    private String nombre;
    private double nota;
    
    //CONSTRUCTORES
    
    //Constructor por defecto
    public Asignatura(){
        this.nombre = "";
        this.nota = 0.0;
    }
    //Constructor parametrizado
    public Asignatura(String nombre, double nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Asigno el nombre al crear el objeto
    public Asignatura(String nombre){
        this.nombre = nombre;
    }
    
    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }
}
