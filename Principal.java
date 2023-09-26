/**
 * Primera clase que es ejecutada
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi aplicación
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Computador miComputador = new Computador("Hp", "Negro", 3000.000);
        miComputador.prender();
        miComputador.apagar();

    }
}
