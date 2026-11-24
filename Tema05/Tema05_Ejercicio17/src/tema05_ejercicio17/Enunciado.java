/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05_ejercicio17;

/**
 *
 * @author User
 */
public class Enunciado {
    //ATRIBUTOS
    private String pregunta;
    private String respuesta;

    //CONSTRUCTORES
    //Constructor por defecto
    public Enunciado() {
        this.pregunta = "";
        this.respuesta = "";
    }

    //Constructor parametrizado
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    //GETTERS Y SETTERS
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
