package tema05.herencia;


/**
 *
 * @author d3stroya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Creamos objetos de cada clase
        System.out.println("CREANDO PERSONAJES...");
        Personaje personaje = new Personaje();
        System.out.println(personaje);
        
        Jugador jugador = new Jugador(50, "combate");
        System.out.println(jugador);
        
        Enemigo enemigo = new Enemigo(30, "espada");
        System.out.println(enemigo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // 2. Probamos sus métodos
        // [!] Todos los personajes tienen el método atacar        
//        System.out.println("\nPROBANDO MÉTODOS...");
//        personaje.atacar();
//        jugador.atacar();
//        enemigo.atacar();
        
        // [!] Solo los jugadores tienen el método mejorarHabilidad
//        jugador.mejorarHabilidad("combate");
//        personaje.mejorarHabilidad("combate");  // Personaje no tiene el método mejorarHabilidad
//        enemigo.mejorarHabilidad("combate");    // Enemigo no tiene el método mejorarHabilidad

        // [!] Solo los enemigos tienen el método crearSoldados
//        enemigo.crearSoldados();
//        personaje.crearSoldados();
//        jugador.crearSoldados();


        // 3. Imprimimos estados
        System.out.println("\nIMPRIMIENDO ESTADOS...");
        System.out.println("Habilidad del jugador: " + jugador.getHabilidad());       
        System.out.println("Vida del jugador: " + jugador.getVida());
//        
        System.out.println("Vida del personaje: " + personaje.getVida());
//        
        System.out.println("Vida del enemigo: " + enemigo.getVida());
        jugador.atacar();
    }    

}
