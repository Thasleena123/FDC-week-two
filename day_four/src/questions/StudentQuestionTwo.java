package questions;

public class StudentQuestionTwo {
    String name;
    int grade;

    public StudentQuestionTwo(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}
