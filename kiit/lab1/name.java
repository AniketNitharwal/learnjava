import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        String fname;
        String lname;

        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        fname = scannerObject.nextLine();

        System.out.print("Enter the last name: ");
        lname = scannerObject.nextLine();

        System.out.println("Your name: " + lname + " " + fname);
    }
}
