class Student {
    String name;
    static int count = 0;

    Student(String name) {
        this.name = name;
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        new Student("Ravi");
        new Student("Anitha");

        System.out.println(Student.count);
    }
}
