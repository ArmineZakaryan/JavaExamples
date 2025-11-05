package core.studentAvg;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("Poxos", new int[]{90});
        Student s2 = new Student("Jon", new int[]{75});
        Student s3 = new Student("Bob", new int[]{20});

        s1.calculateAverage();
        s2.calculateAverage();
        s3.calculateAverage();
    }
}