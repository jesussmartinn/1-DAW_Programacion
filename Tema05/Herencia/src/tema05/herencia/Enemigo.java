package tema05.herencia;

/**
 *
 * @author d3stroya
 */
public class Enemigo extends Personaje {
    // ATRIBUTOS
    private String arma;


    // CONSTRUCTORES
    public Enemigo() {
        super();
        this.arma = "";
    }
    
    public Enemigo(int vida, String arma) {
        super(vida);
        this.arma = arma;
    }

    // GETTERS Y SETTERS
    public String getArma() {
        return this.arma;
    }
    
    public void setArma(String arma) {
        this.arma = arma;
    }

    // MÉTODOS
    public void crearSoldados() {
        System.out.println("Creando soldados...");
    }


    // TO STRING
    @Override
    public String toString() {
        return super.toString() + " y es un ENEMIGO con arma: " + this.arma;
    }
}
