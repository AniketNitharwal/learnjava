import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

class ProcessInputDemo {

    void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative number entered");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessInputDemo obj = new ProcessInputDemo();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            obj.ProcessInput(n);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
