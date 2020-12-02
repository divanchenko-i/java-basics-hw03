import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;
  private static List<Student> students = new ArrayList<>();
  private static int sumRating = 0;
  private static int numberOfStudents = 0;




// TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;
    this.rating = 0;
    Student.students.add(this);
    numberOfStudents = numberOfStudents + 1;
    //TODO initialize name
  }

  public static double getAvgRating() {
    // TODO return average rating of all students
    return new Double(sumRating)/new Double (numberOfStudents);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    sumRating = sumRating - this.rating;
    this.rating = rating;
    sumRating = sumRating + this.rating;

    // TODO initialize rating;
  }

  public boolean betterStudent(Student student) {

    // TODO return the result of comparing this.student's rating with the student's rating
    return this.rating > student.getRating();
  }

  public void changeRating(int rating) {
    sumRating = sumRating - this.rating;
    this.rating = rating;
    sumRating = sumRating + this.rating;
    // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    sumRating = sumRating - student.rating;
    // TODO remove student
  }



  @Override
  public String toString() {
    // TODO return String with name and rating of this student
    return this.name + " " +this.rating;
  }
}
