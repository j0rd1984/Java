Constructores , sobrecarga y sobreescritura.
Considera el siguiente código fuente JAVA
package edu.upc.eetac.dsa.exercises.java.lang; 
public class App { 
    public static void main(String args[]) { 
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4); 
        arboles[1] = new Tree("Roble"); 
        arboles[2] = new Tree(); 
        arboles[3] = new Tree(5,"Pino");
    } 
}
completa con el código que haga falta para que la salida sea:
Un árbol de 4 metros 
Un Roble 
Un árbol 
Un Pino de 5 metros