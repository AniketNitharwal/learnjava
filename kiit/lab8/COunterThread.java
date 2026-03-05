import java.util.*;

class CounterThread extends Thread {
    int low, high;

    CounterThread(String name, int low, int high) {
        super(name);
        this.low = low;
        this.high = high;
    }

    public void run() {
        System.out.println("Thread - " + getName());
        System.out.print("Counter - ");

        for (int i = low; i <= high; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class COunterThread {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thread name: ");
        String name = sc.nextLine();

        System.out.print("Enter lower range: ");
        int low = sc.nextInt();

        System.out.print("Enter upper range: ");
        int high = sc.nextInt();

        CounterThread t = new CounterThread(name, low, high);
        t.start();
    }
}