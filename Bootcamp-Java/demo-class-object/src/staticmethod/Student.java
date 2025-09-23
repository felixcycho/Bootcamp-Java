package staticmethod;

public class Student {
  private static int score = 100;    // this static 100 cannot be input into an object, thus cannot be called over.
  private String name;
  private String id;

  // Constructor
  public Student(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // instance method
  public int calculate(int x, int y) {
    return x + y + this.name.length();
  }

  // Static method,  無用到 object 元素, object 無須不時往 static method 去 call over.
  // Static 是 public 公家東西, 所以不會被 this.address 去 call over.
  // Static method 旨在用於節省 memory.
  // ! You CAN/SHOULD use static here, because you did not use object attribute for processing.
  public static int calculate2(int x, int y) {
    return x + y;
  }

  // instance method
  public int nameLength() {
    return this.name.length();
  }

  // Setter
  // instance method
  public void setName(String name) {
    this.name = name;
  }

  // Setter
  // instance method
  public void setId(String id) {
    this.id = id;
  }

  // Getter
  // instance method
  public String getName() {
    return this.name;
  }

  // Getter
  // instance method
  public String getId() {
    return this.id;
  }
  
  // !! 每個 class 都需要寫 toString.
  // instance method
  public String toString() {
    return "Student(" //
          + "name = " + this.name //
          + ", id = " + this.id   //
          + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("John", "HKU1234");
    Student s2 = new Student("Peter", "HKU4321");
    System.out.println(s1);    // Student(name = John, id= HKU1234)
    System.out.println(s2);    // Student(name = Peter, id= HKU 4321)

    System.out.println(s1.calculate(3, 4));    // 3 + 4 + 4 => 11
    System.out.println(s2.calculate(3, 4));    // 3 + 4 + 5 => 12

    // The way to call over static method:
    // You may use Class name to call over static method.
    // You may NOT use Object to call over static method.
    System.out.println(Student.calculate2(100, 53));
    // System.out.println(s1.calculate2(100, 53));     // invalid
    // Object (e.g. s1, s2, etc.) may only be used to call over instance method.


  }
}
