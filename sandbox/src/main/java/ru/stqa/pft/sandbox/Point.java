package ru.stqa.pft.sandbox;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double distance(Point p2)
    {
        double distance = Math.sqrt(Math.pow(this.x-p2.x,2) + Math.pow(this.y-p2.y,2));
        System.out.println(" Расстояние между точками p1 и p2 " + " = " + distance);

        return distance;
    }
}
   /* public static double distance(Point p1, Point p2)
    {
        double distance = Math.sqrt(Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2));
        System.out.println(" Расстояние между точками p1 и p2 " + " = " + distance);
        return distance;
    }*/








