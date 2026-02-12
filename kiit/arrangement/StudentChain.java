class StudentChain {
    int id;
    String name;
    int age;

    StudentChain() {
        System.out.println("Default Constructor");
    }

    StudentChain(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    StudentChain(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        StudentChain s = new StudentChain(101, "Rahul", 20);
        s.display();
    }
}