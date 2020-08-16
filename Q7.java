import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(80, 120, 90);
        System.out.println(tri.getArea());
    }
}

class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        int s = (a + b + c) / 2;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }
}