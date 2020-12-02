public class Student {
  private int rating;
  private String name;
  private static int sumRating = 0;
  private static int numberOfStudents = 0;

  public Student(String name) {
    this.name = name;
    this.rating = 0;
    numberOfStudents = numberOfStudents + 1;
  }

  public static double getAvgRating() {
    if (numberOfStudents == 0 || sumRating == 0) {
      return 0.0d;
    }
    return (double) sumRating / (double) numberOfStudents;
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
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.getRating();
  }

  public void changeRating(int rating) {
    sumRating = sumRating - this.rating;
    this.rating = rating;
    sumRating = sumRating + this.rating;
  }

  public static void removeStudent(Student student) {
    sumRating = sumRating - student.rating;
    numberOfStudents = numberOfStudents - 1;
  }

  @Override
  public String toString() {
    return this.name + " " +this.rating;
  }
}
