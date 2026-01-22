
interface Motor {
    int capacity = 5;   

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity");
    }

    void displayCapacity() {
        System.out.println("Motor Capacity: " + capacity);
    }
}

public class MotorDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}
