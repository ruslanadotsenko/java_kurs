package ru.stqa.pft.sandbox;

/**
 * Created by ruslana on 28.08.16.
 */
public class Square {

    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area(){
        return this.l * this.l;
    }
}
