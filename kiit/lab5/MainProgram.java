import java.util.Scanner;
class Employee {
    protected int empid;     
    private String ename;

  
    Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

   
    public double earnings(double basic) {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}


class Sales extends Employee {

    Sales(int empid, String ename) {
        super(empid, ename);
    }

   
    double tallowance(double totalEarning) {
        return 0.05 * totalEarning;
    }
}


public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Sales s = new Sales(empid, name);

        double earning = s.earnings(basic);
        double ta = s.tallowance(earning);
        double total = earning + ta;

        System.out.println("\nEmployee ID: " + s.empid);
        System.out.println("Total Earnings: " + total);
    }
}
