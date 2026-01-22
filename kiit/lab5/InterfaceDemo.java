import java.util.Scanner;

interface Employee {
    void getDetails();
}


interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {

    int empid;
    String ename;
    int deptid;
    String deptname;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine();   

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter Department ID: ");
        deptid = sc.nextInt();
        sc.nextLine();   

        System.out.print("Enter Department Name: ");
        deptname = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Head of Department Details ---");
        System.out.println("Employee ID   : " + empid);
        System.out.println("Employee Name : " + ename);
        System.out.println("Department ID : " + deptid);
        System.out.println("Department    : " + deptname);
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
