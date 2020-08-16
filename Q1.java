import java.util.*;

public class Q1 {

    interface Add {
        int add(int a, int b);
    }

    interface Subtract {
        int difference(int a, int b);
    }

    interface Product {
        int product(int a, int b);
    }

    interface SafeDivision {
        int safedivision(int a, int b);
    }

    public static void main(String[] args) {

        Add a = (int x, int y) -> {
            return x + y;
        };

        Subtract b = (int x, int y) -> {
            return x - y;
        };

        Product c = (int x, int y) -> {
            return x * y;
        };

        SafeDivision d = (int x, int y) -> {
            return x / y;
        };

        System.out.println(a.add(1, 2));
        System.out.println(b.difference(10, 2));
        System.out.println(c.product(2, 3));
        System.out.println(d.safedivision(10, 2));
    }
}