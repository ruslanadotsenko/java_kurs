package ru.stqa.pft.sandbox;

/**
 * Created by ruslana on 29.08.16.
 */
public class Point {
    public double p1;
    public double p2;
    public double d;


    public static void main(String[] args) {

        double x1 = 1;
        double y1 = 1;
        double x2 = 4;
        double y2 = 3;

        double p1 = x2 - x1;
        System.out.println(" Расстояние между точками x2 и x1 " + " = " + p1);

        double p2 = y2 - y1;
        System.out.println(" Расстояние между точками y2 и y1 " + " = " + p2);

        double d = Math.sqrt((p1 * p1) + (p2 * p2));
        System.out.println(" Расстояние между точками p1 и p2 " + " = " + d);
    }

}


  /*  public static double distance( String Point p1, String Point p2){
        return Math.sqrt((p1 * p1) + (p2 * p2));
    }*/







