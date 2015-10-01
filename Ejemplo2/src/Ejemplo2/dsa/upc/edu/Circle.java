package Ejemplo2.dsa.upc.edu;

/**
 * Created by Jordi on 27/09/2015.
 */
public class Circle extends AbstractShape {
    private double radio;

    public Circle(double radio) {
        super("circle");
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    //public void setRadio(double radio) {
       // this.radio = radio;
    //}

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
