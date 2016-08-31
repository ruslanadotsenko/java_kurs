package ru.stqa.pft.sandbox;

public class FirstHello {

 public static void main(String[] args) {
	hello("world");
     hello("user");
     hello("Rusia");

     Square s =  new Square(5);
     System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

     Rectangle r = new Rectangle(3, 5);
     System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}

public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");

}


}

