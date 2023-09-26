/**
 * Clase Computador
 */
public class Computador {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
    String marca;
    String color;
    double precio;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Computador: Inicializa los atributos de mi clase
     * @param marca
     * @param color
     * @param precio
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Computador(String marca, String color, double precio){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    /**
     * Método de inicia el computador
     * @return boolean: Indica si mi carro pudo prender
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean prender(){
        System.out.println("me encendí");
        return true;
    }

    /**
     * Método que apaga mi computador
     * @return boolean: Indica si mi computador se pudo apagar
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean apagar(){
        System.out.println("Me apagué");
        return true;
    }



}
