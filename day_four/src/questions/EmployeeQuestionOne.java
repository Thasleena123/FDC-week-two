package week_two.day_four.src.questions;

public class EmployeeQuestionOne implements Comparable<EmployeeQuestionOne> {
    int id;
    public String name;
    double salary;
    public int age;

    public EmployeeQuestionOne(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String toString() {
        return "Employee{id," + id + " name=" + name + ",  age=" + age + ", salary =" + salary + "}";
    }


    @Override
    public int compareTo(EmployeeQuestionOne that) {
        return Integer.compare(this.id, that.id);
    }
}
