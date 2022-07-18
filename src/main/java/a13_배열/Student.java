package a13_배열;

public class Student {
    private String studentName;
    private int studentYear;

    public Student() {

    }

    public Student(String studentName, int studentYear) {
        super();
        this.studentName = studentName;
        this.studentYear = studentYear;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }
}
