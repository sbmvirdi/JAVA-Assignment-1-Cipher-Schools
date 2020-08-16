import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Complex com1 = new Complex(2, 5);
        Complex com2 = new Complex(4, 7);
        com1.add(com2);
        com2.sub(com1);
        com1.product(com2);
    }
}

class Complex {
    int real, imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void display() {
        System.out.println(real + "+i" + imag);
    }

    public void add(Complex o) {
        int r = this.real + o.real;
        int c = this.imag + o.imag;
        System.out.println(r + "+i" + c);
    }

    public void sub(Complex o) {
        int r = this.real - o.real;
        int c = this.imag - o.imag;
        System.out.println(r + "+i" + c);
    }

    public void product(Complex o) {
        int r = this.real * o.real;
        int c = this.imag * o.imag;
        System.out.println(r + "+i" + c);
    }

}