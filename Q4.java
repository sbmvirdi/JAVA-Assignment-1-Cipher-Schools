import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

    }
}

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}