class AgeNotWithinRangeException extends Exception {
  public AgeNotWithinRangeException(String message) {
      super(message);
  }
}

class NameNotValidException extends Exception {
  public NameNotValidException(String message) {
      super(message);
  }
}

class Student {
  private int rollNo;
  private String name;
  private int age;
  private String course;

  public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
      this.rollNo = rollNo;

      // Validate and set the name
      if (!isValidName(name)) {
          throw new NameNotValidException("Invalid name. Name should not contain numbers or special symbols.");
      }
      this.name = name;

      // Validate and set the age
      if (!isValidAge(age)) {
          throw new AgeNotWithinRangeException("Invalid age. Age should be between 15 and 21.");
      }
      this.age = age;

      this.course = course;
  }

  private boolean isValidName(String name) {
      // Check if the name contains any numbers or special symbols
      return name.matches("[a-zA-Z\\s]+");
  }

  private boolean isValidAge(int age) {
      // Check if the age is within the range of 15 to 21 (inclusive)
      return age >= 15 && age <= 21;
  }

  public int getRollNo() {
      return rollNo;
  }

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  public String getCourse() {
      return course;
  }
}

public class StudentExample {
  public static void main(String[] args) {
      try {
          // Create a student object with valid data
          Student student1 = new Student(1, "John Doe", 18, "Computer Science");
          System.out.println("Student 1: " + student1.getName() + " (Roll No: " + student1.getRollNo() + ", Age: " + student1.getAge() + ", Course: " + student1.getCourse() + ")");

          // Create a student object with an invalid name
          Student student2 = new Student(2, "Jane123", 20, "Mathematics");
          System.out.println("Student 2: " + student2.getName() + " (Roll No: " + student2.getRollNo() + ", Age: " + student2.getAge() + ", Course: " + student2.getCourse() + ")");
      } catch (NameNotValidException | AgeNotWithinRangeException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}
