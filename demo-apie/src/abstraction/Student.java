public class Student extends Human implements Eatable, Studiable {
// or instead, public class Student extends Human implements Studiable {        is also OK.
// because Human also has skill eat().
// Once if child class Student extends parent class Human, no matter if "implements Eatable" written, is OK.

  // Constructor
  public Student(String name) {
    // New Java keyword: super
    super(name);    // Calling parent class (Human) Constructor 
  }

  @ Override
  public void eat() {
    System.out.println("Student " + super.getName() + " is eating.");
  }

  @ Override
  public void study() {
    System.out.println("Student " + super.getName() + " is studying.");
  }

  public static void main (String[] args) {

    Student s1 = new Student("Fefe");
    // s1.fly();         invalid, because both Human and Student classes do not have skill fly().
    s1.eat();
    Student s2 = new Student("Felix");
    // s2.fly();
    s2.eat();
    s2.study();

    // Polymorphism
    // ! "Hide" Superman Object "Skill"
    // Flyable student = new Student("Leo");         // invalid, Student class does NOT implement Flyable class.
    // Student ("Leo") cannot fly.
    Eatable student1 = new Student("Leo");
    student1.eat();
    // student.study();                             // invalid, Eatable does not have study(), Leo's skill study() is blocked.
    // student.fly();                               // invalid, neither Student nor Eatable have skill fly().
                                                    // Compile time Polymorphism, check type of Object.
    // System.out.println(student.getName());       //invalid, because Flyable does not have getName().
    // thus, student can only call eat, but cannot call study.
    // ! Student object has study()) ?     The answer is YES.
    // ! SOLUTION:
    // Studiable student2 = student;                // invalid
    // Studiable student2 = (Studiable) student       // not recommended

    // ! "Unhide" Superman Object all skills
    Student student2 = (Student) student1;
    // In order to unblock the ability of study, the above order should be called.
    // And hence, to getName(), student should be converted into student2.
    System.err.println(student2.getName());          // Leo
    System.out.println(student2);                    // src.abstraction.Suprman@816f27d
    System.out.println(student2.getName());          // Leo

    Human student3 = new Student("Philip");         // Human 是 Parent, parent class 永遠少技能於 Child class.
    System.out.println(student3.getName());          // Philip
    student3.eat();
    // student3.study();                             // superman cannot call study(), because Human only implements Eatable.

    Studiable[] students = new Studiable[3];         // Studiable only have skill study(), but Human may also extends its skills in future.
    // Eatable human11111 = new Eatable;             // invalid
    // Eatable cannot create object, but Eatable can create an array, to absorb eatable humans.
    // On the other side, Studiable also cannot create object, but can create an array, to absorb studiable students.
    students[0] = new Student("Justin");
    // students[1] = new Superman("Regina");            // invalid, Superman cannot convert into Studiable.
    students[1] = new Student("Regina");
    students[2] = new Student("Candice");
    for (Studiable student : students) {
      // student.eat();                                 // invalid, Studiable does not have eat().
      student.study();
    }

    Eatable[] humans = new Eatable[3];         // Eatable only have skill eat(), but Human may also extends its skills in future.
    // Eatable human11111 = new Eatable;       // invalid
    // Eatable cannot create object, but Eatable can create an array, to absorb eatable humans.
    // On the other side, Eatable also cannot create object, but can create an array, to absorb eatable humans.
    humans[0] = new Student("Justin");
    humans[1] = new Superman("Regina");        // in this case, Regina is Superman, which is Human, thus can eat().
    humans[2] = new Student("Candice");
    for (Eatable human : humans) {
      human.eat();
    }


  }
}
