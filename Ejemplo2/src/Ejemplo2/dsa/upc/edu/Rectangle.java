package Ejemplo2.dsa.upc.edu;

/**
 * Created by Jordi on 27/09/2015.
 */
public class Rectangle extends AbstractShape {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        super("rectangle");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double area() {
        return x * y;
    }
}
