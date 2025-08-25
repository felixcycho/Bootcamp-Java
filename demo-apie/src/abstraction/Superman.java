package src.abstraction;

// Class name "implements" Interface name
// Class Superman 履行 Flyable 合約.
// ! Interface control the child class method availability at compile time.

public class Superman extends Human implements Flyable, Eatable {
  // private String name;

  // public Superman(String name) {
  //  this.name = name;
  // }

  // public String getName() {
  //  return this.name;
  // }

  // Constructor
  public Superman(String name) {
    // New Java keyword: super
    super(name);    // Calling parent class (Human) Constructor 
  }

  // 1. Skill
  @ Override
  public void fly() {
    System.out.println("Superman " + super.getName() + " is flying.");      
    // because parent class has private its name.
    // Thus, child class cannot directly access to parent's name.
    // So, child class should super.getName() the parent's name.
  }
  @ Override
  public void eat() {
    System.out.println("Superman " + super.getName() + " is eating.");
  }

  public static void main (String[] args) {

    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    Superman s2 = new Superman("Lucas");
    s2.fly();
    s2.eat();

    // Polymorphism
    // ! "Hide" Superman Objectg "Skill"
    Flyable superman = new Superman("Leo");         // Flyable does not have eat()
    // In this case, Superman("Leo") ability of eat() is being blocked.
    // Superman("Leo") can just fly, not eat.
    superman.fly();
    // superman.getName();     invalid, because Flyable does not have getName().
    // superman.eat();         // Compile time Polymorphism, check type of Object.
    // thus, superman can only call fly, but cannot call eat.
    // ! superman object has eat() ?     The answer is YES.
    // ! SOLUTION:
    // Eatable superman2 = superman;                // invalid
    // Eatable superman2 = (Eatable) superman       // not recommended

    // ! "Unhide" Superman Object all skills
    Superman superman2 = (Superman) superman;
    // In order to unblock the ability of eat, the above order should be called.
    // And hence, to getName(), superman should be converted into superman2.
    System.err.println(superman2.getName());          // Leo
    System.out.println(superman2);                    // src.abstraction.Suprman@816f27d
    System.out.println(superman2.getName());          // Leo

    Human superman3 = new Superman("Steven");         // Human 是 Parent, parent class 永遠少技能於 Child class.
    System.out.println(superman3.getName());          // Steven
    superman3.eat();
    // superman3.fly();                               // superman cannot call fly(), because Human only implements Eatable.

    Eatable[] humans = new Eatable[3];         // Eatable only have skill eat(), but Human may also extends its skills in future.
    // Eatable human11111 = new Eatable;       // invalid
    // Eatable cannot create object, but Eatable can create an array, to absorb eatable humans.
    // On the other side, Flyable also cannot create object, but can create an array, to absorb flyable humans.
    humans[0] = new Student("Jennie");
    humans[1] = new Superman("Kelly");
    humans[2] = new Student("Alden");
    for (Eatable human : humans) {
      human.eat();
    }


  }
}
