package ru.stqa.pft.sandbox;

/**
 * Created by ruslana on 31.08.16.
 */

class DistanceCalculation {

    public static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);


        double distance = Math.sqrt(Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2));
        System.out.println(" Расстояние между точками p1 и p2 " + " = " + distance);

    }
}