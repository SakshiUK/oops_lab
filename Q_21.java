//Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 10);

        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        // Print student information
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());

        // Remove a course
        student.removeCourse("Science");

        // Print updated courses
        System.out.println("Updated Courses: " + student.getCourses());
    }
}
