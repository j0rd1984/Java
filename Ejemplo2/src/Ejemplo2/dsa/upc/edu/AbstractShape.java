package Ejemplo2.dsa.upc.edu;

/**
 * Created by Jordi on 27/09/2015.
 */
public abstract class AbstractShape implements Shape {
    private String frase;

    public AbstractShape(String type) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "I'm a " + frase;
    }
}