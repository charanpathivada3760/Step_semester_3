class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("Ravi");
        System.out.println(s.name);
    }
}
