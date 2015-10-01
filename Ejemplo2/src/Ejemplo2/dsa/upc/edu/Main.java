package Ejemplo2.dsa.upc.edu;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.3);
        shapes[1] = new Rectangle(15, 5);
        for (Shape shape : shapes)
            System.out.println(shape + " with area = " + shape.area());
    }
}

