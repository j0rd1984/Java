/*
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Jordi López
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package edu.upc.dsa.Ejemplo1;


public class Tree {
    private int height;
    private String name;

    public Tree() {
        this(0, null);
    }

    public Tree(int height) {
        this(height, null);
    }

    public Tree(String name) {
        this(0, name);
    }

    public Tree(int height, String name) {
        this.height = height;
        this.name = name;
    }

  /*  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (name == null)
            sb.append("árbol");
        else
            sb.append(name);
        if (height > 0)
            sb.append(" de ").append(height).append(" metros");
        return sb.toString();
    }*/
    public void Write(){
        System.out.print("Un ");
        if (name==null) {
            System.out.print("arbol");
        }else{
            System.out.print(name);
        }
        if (height >0){
            System.out.println(" de " + height + " metros");
        } else {
            System.out.println("");
        }
    }
}