import java.util.Scanner;


class Plate {
    double length, width;

    Plate(Scanner sc) {
        System.out.println("Plate Constructor");
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }
}


class Box extends Plate {
    double height;

    Box(Scanner sc) {
        super(sc);  
        System.out.println("Box Constructor");
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(Scanner sc) {
        super(sc);  
        System.out.println("WoodBox Constructor");
        System.out.print("Enter thickness: ");
        thick = sc.nextDouble();
    }
}


public class Construct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Creating WoodBox Object:\n");
        WoodBox wb = new WoodBox(sc);

        sc.close();
    }
}
