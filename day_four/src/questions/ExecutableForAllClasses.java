package questions;

import java.util.*;

public class ExecutableForAllClasses {
    public static void question1() {
        List<EmployeeQuestionOne> employees = Arrays.asList(new EmployeeQuestionOne(1, "Alice", 56, 2800), new EmployeeQuestionOne(2, "Bob", 75, 3500), new EmployeeQuestionOne(3, "Charlie", 50, 2200));
        Collections.sort(employees);
        System.out.println("Sorted by id comparable:");
        // for(Employee employee:employees){
        System.out.println(employees);

        employees.sort(Comparator.comparing((EmployeeQuestionOne employee) -> employee.name).thenComparing((EmployeeQuestionOne employee) -> employee.age));

        System.out.println("sorted by name,age");
        employees.forEach(employee -> System.out.println(employee));

    }

    public static void question2() {
        CourseQuestion2 course1 = new CourseQuestion2("Math", Arrays.asList(new StudentQuestionTwo("Alice", 85), new StudentQuestionTwo("Bob", 90)));
        CourseQuestion2 course2 = new CourseQuestion2("History", Arrays.asList(new StudentQuestionTwo("Charlie", 80), new StudentQuestionTwo("Dave", 75)));
        List<CourseQuestion2> courses = Arrays.asList(course1, course2);
        courses.sort(Comparator.comparingDouble(CourseQuestion2::getAverageGrade).reversed().thenComparing(CourseQuestion2::getCoursename));
        for (CourseQuestion2 course : courses) {
            course.getStudents().sort(Comparator.comparingInt(StudentQuestionTwo::getGrade).reversed());

            courses.forEach(cours -> {
                System.out.println(course);
                course.getStudents().forEach(System.out::println);
            });
        }
    }

    public static void question3() {
        List<BookQuestion3> books = Arrays.asList(new BookQuestion3("The Hobbit", "J.R.R. Tolkien", 1937), new BookQuestion3("1984", "George Orwell", 1949), new BookQuestion3("Animal Farm", "George Orwell", 1945));
        books.sort(Comparator.comparing(BookQuestion3 :: getAuthor).thenComparing(BookQuestion3::getTitle).thenComparing(BookQuestion3::getPublicationYear).reversed());

        books.forEach(book -> System.out.println(books));

    }
}

