package tema05.herencia;

/**
 *
 * @author d3stroya
 */
public class Jugador extends Personaje {
    // ATRIBUTOS
    private String habilidad;


    // CONSTRUCTORES
    public Jugador() {
        // Llamar al constructor por defecto de Personaje
        super();
        this.habilidad = "";
    }
    
    public Jugador(int vida, String habilidad) {
        super(vida);
        this.habilidad = habilidad;
    }

    // GETTERS Y SETTERS
    public String getHabilidad() {
        return this.habilidad;
    }
    
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    // MÉTODOS
    public void mejorarHabilidad(String habilidad) {
        System.out.println("Mejorando la habilidad " + habilidad + "...");
    }


    // TO STRING
    @Override
    public String toString() {
        return super.toString() + " y es un JUGADOR con habilidad de " + this.habilidad;
    }
}
