package questions;

import java.util.List;

public class CourseQuestion2 {

    String coursename;
    List<StudentQuestionTwo> students;


    public CourseQuestion2(String coursename, List<StudentQuestionTwo> students) {
        this.coursename = coursename;
        this.students = students;

    }

    public String getCoursename() {
        return coursename;
    }

    public List<StudentQuestionTwo> getStudents() {
        return students;
    }

    public double getAverageGrade() {
        return students.stream()
                .mapToInt(StudentQuestionTwo::getGrade)
                .average()
                .orElse(0);
    }
    public String toString() {
        return "Course{name='" + coursename + "', students=" + students + "}";
    }

}