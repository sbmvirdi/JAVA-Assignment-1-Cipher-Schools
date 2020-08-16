import java.util.*;

class Rectangle {
    int height, width;

    public void display() {
        System.out.println("Height::" + height + " width::" + width);
    }
}

class RectangleArea extends Rectangle {

    public void read_input() {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
    }

    public void display() {
        System.out.println("Area::" + (height * width));
    }

}

public class Q2 {

    public static void main(String[] args) {
        RectangleArea mRectangleArea = new RectangleArea();
        mRectangleArea.read_input();
        mRectangleArea.display();
    }
}