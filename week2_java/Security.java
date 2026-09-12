class Student {
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    void show() {
        System.out.println(marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(90);
        s.show();
    }
}
