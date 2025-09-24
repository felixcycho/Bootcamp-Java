public class DemoInnerClass {
  public static void main(String[] args) {
    Student s1 = new Student(12);
    // new Student.College();                       // not static class, thus cannot call College()

    // nested static class
    Bag.Ball b1 = new Bag.Ball(Bag.Color.RED);

    // inner class
    Student.College c1 = new Student(15).new College("Lucas");       // College object can read Student object data
    System.out.println();

  }
  
}
