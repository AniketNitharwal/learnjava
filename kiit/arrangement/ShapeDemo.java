abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.area();
    }
}