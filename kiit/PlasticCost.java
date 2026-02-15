import java.util.Scanner;
class Sheet {
    protected double length, width;

    void input2D(Scanner sc) {
        System.out.print("Enter length (in ft): ");
        length = sc.nextDouble();

        System.out.print("Enter width (in ft): ");
        width = sc.nextDouble();
    }

    double calculateCost() {
        double area = length * width;
        return area * 40;
    }
}

class Box extends Sheet {
    private double height;

    void input3D(Scanner sc) {
        input2D(sc);  
        System.out.print("Enter height (in ft): ");
        height = sc.nextDouble();
    }

    double calculateCost() {
        double volume = length * width * height;
        return volume * 60;
    }
}

// Main class
public class PlasticCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.println("Enter dimensions of plastic box:");
        b.input3D(sc);

        System.out.println("Cost of 2D Sheet = Rs. " + b.calculateCost());
        System.out.println("Cost of 3D Box   = Rs. " + b.calculateCost());

        sc.close();
    }
}
