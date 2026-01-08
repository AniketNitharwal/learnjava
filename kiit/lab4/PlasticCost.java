import java.util.Scanner;

// 2D Sheet class
class Sheet {
    protected double length, width;

    void input2D(Scanner sc) {
        System.out.print("Enter length (in ft): ");
        length = sc.nextDouble();

        System.out.print("Enter width (in ft): ");
        width = sc.nextDouble();
    }

    double cost2D() {
        double area = length * width;
        return area * 40;
    }
}

// 3D Box class inheriting Sheet
class Box extends Sheet {
    private double height;

    void input3D(Scanner sc) {
        input2D(sc);   // calling parent method
        System.out.print("Enter height (in ft): ");
        height = sc.nextDouble();
    }

    double cost3D() {
        double volume = length * width * height;
        return volume * 60;
    }
}

// Main class
public class PlasticCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box box = new Box();

        System.out.println("Enter dimensions of plastic box:");
        box.input3D(sc);

        System.out.println("Cost of 2D Sheet = Rs. " + box.cost2D());
        System.out.println("Cost of 3D Box   = Rs. " + box.cost3D());

        sc.close();
    }
}
