class Student {
    int marks;
}

class Main {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = a;

        b.marks = 90;

        System.out.println(a.marks);
    }
}
