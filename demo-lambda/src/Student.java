public class Student {
  private int age;

  public Student (int age) {
    this.age = age;
  }

  // ! Outer Class Object cannot real inner Class attribute
  // ! but, inner Class Object can read outer Class attribute
  // public String collegeInfo() {                              // invalid
  //   return "College name = " + name                          // invalid
  // }

  public int sum(int x, int y) {
    // ! Method Local Inner Class   (為學而學, 實際上沒有人會寫這樣 code)
    class Calculator {
      private int x;
      private int y;

      Calculator(int x, int y) {
        this.x = x;
        this.y = y;
      }

      public int sum() {
        return this.x + this.y;
      }
    }
    return new Calculator(x, y).sum();
  }

  public class College {
    private String name;

    public College (String name) {
      this.name = name;
    }

    public String studentInfo() {
      return "Student age = " + age
           + ", College name = " + name;
    }

  }

}
