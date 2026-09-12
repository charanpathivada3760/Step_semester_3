class Student {
    String name;
    int age;

    void show() {
        System.out.println(name + " " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";
        s.age = 20;
        s.show();
    }
}
