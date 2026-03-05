class Display {

    synchronized void display(String msg, String tname) {
        String words[] = {"I", "Love", "Java", "Very", "Much"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(tname + ": " + words[i]);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Display obj;

    Thread1(Display obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("msg", "Thread 1");
    }
}

class Thread2 extends Thread {
    Display obj;

    Thread2(Display obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("msg", "Thread 2");
    }
}

public class SyncDemo {
    public static void main(String args[]) {

        Display obj = new Display();   // FIXED

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}