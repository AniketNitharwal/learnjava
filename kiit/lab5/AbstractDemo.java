import java.util.Scanner;

abstract class Student {
    int roll_no;
    int reg_no;

   
    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();

        System.out.print("Enter Registration Number: ");
        reg_no = sc.nextInt();
    }


    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course: B.Tech");
    }

    void display() {
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Registration Number: " + reg_no);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        k.getinput();
        k.course();
        k.display();
    }
}
