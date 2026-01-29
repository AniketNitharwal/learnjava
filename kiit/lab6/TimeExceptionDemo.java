import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

class Time {
    int hrs, min, sec;

    void getTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hrs = sc.nextInt();
        if (hrs < 0 || hrs > 24)
            throw new HrsException("Invalid hours");

        System.out.print("Enter minutes: ");
        min = sc.nextInt();
        if (min < 0 || min > 60)
            throw new MinException("Invalid minutes");

        System.out.print("Enter seconds: ");
        sec = sc.nextInt();
        if (sec < 0 || sec > 60)
            throw new SecException("Invalid seconds");

        System.out.println("Valid Time: " + hrs + ":" + min + ":" + sec);
    }
}

class TimeExceptionDemo {
    public static void main(String[] args) {

        Time t = new Time();

        try {
            t.getTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println(e.getMessage());
        }
    }
}
