class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(2405332, "Aniket");
        s.display();
    }
}