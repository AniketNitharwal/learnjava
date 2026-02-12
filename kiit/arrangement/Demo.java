class Demo {
    void show() {
        System.out.println("Show method");
    }

    void display() {
        this.show();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}