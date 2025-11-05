package core;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void checkResult() {
        if (grade < 50) {
            System.out.println("Fail");
        } else if (grade < 80) {
            System.out.println("Good");
        } else if (grade > 80) {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Anna", 45),
                new Student("Mariam", 75),
                new Student("Tigran", 85)};
        for (int i = 0; i < students.length; i++) {
            students[i].checkResult();
        }
    }
}