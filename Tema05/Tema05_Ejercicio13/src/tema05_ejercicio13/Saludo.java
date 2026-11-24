/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio13;

/**
 *
 * @author User
 */
public class Saludo {
    //ATRIBUTOS
    private String frase;

    //CONSTRUCTORES
    //Por defecto
    public Saludo() {
        this.frase = "";
    }

    //Parametrizado
    public Saludo(String frase) {
        this.frase = frase;
    }

    //GETTERS Y SETTERS
    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
