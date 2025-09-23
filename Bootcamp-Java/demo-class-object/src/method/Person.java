// Java: Object Oriented Programming (OOP) 物件導向語言, 以物件為中心, 形容物件深度闊度
// Examples of OOP:  Java, C++, C#, ...
// Python is not OOP.

// Blueprint: 形容物件的特徵
// 我們要描述的世界的 Person, 他們只有 Name 及 Age.
// Java 的世界, 是不會重複 Object.
// ! (Wrong concept in Java) 因為 Person 特徵太少 (only name and age), 這世界的 Person 好易重覆 name and age.
// ! (Correct concept in Java) 因為我想形容, 這世界的 Person, 是不會重覆 name and age, 我才會 design 這個 class.
// e.g. I.D. No., 訂單編號, Confirmation Code 都是由 Java 去 generate, 確保不會重覆.
// 兩個 objects 之所以兩個 objects, 其中之一是因為不同 position, 抽象概念, 不同 xy 座標位置.
// Class, 是用作 define what is a unique object, 確保 Object 有足夠空間使用, 不多不少.
// 如果 Class 容許兩個 unique objects, 有某些特徵可重覆, 則只需 adjust class, 以確保所有 objects 至少有一個特徵是 unique, i.e. ID code.
// 例如, 可用 game 作為例子, 比喻世界.  
// Class Person {
//  private String color;
//  private int x;
//  private int y;
// }
// Class 所表達的意思是, 去生產一件 unique object, 只要某一個 private 特徵是 unique, 則其他 private 待徵皆可重覆.
// 特徵, 在英文上, 稱為 Attribute.
// 否則, 會出現 Design Mistake, java programme 會有 bugs.

import java.math.BigDecimal;
// class 絶不可 private, 只可寫 public, 或者索性不寫 private / public. 
// 另外, User 希望用一個 person 搜尋該人的 date of birth, 而不是利用 date of birth 搜尋所有 persons.
public class Person {
  // 以下稱為 Attribute (特徵), 沒有固定表達模式.
  // Attribute ()
  private int age;                   // 描述什麼是 age
  private String name;               // 描述什麼是 name
  private String emailAddress;       // 描述什麼是 email address
  private String idNumber;
  private String gender;

  // Constructor
  public Person(String name, int age, String emailAddress, String idNumber, String gender) {
    this.name = name;
    this.age = age;
    this.emailAddress = emailAddress;
    this.idNumber = idNumber;
    this.gender = gender;
  }

  // Setter 改寫功能
  // Method --> input (optional) --> output (optional)
  // void, 意思是 No Return Type, 不像 int, LocalDate, String, ...
  public void setAge(int age) {
    this.age = age;
  }
  // Getter
  public int getAge() {              // 向 object 取 attribute / data
    return this.age;
  }

  public boolean isElderly() {
    return this.age > 65;
  }

  public static boolean isElderly(Person person) {
    return person.getAge() > 65;      // static method 可用 Class 去 call, 只是不能用 Object 去 call.
  }

  public static void main(String[] args) {
    // "new" --> create object
    // "Person" --> class name
    // "()" --> constructor
    Person p1 = new Person("Felix Cho", 39, "felixcycho@yahoo.com.hk", "A123456", "M");    // 保留名稱, 可隨時 call over object.
    // "p1" is a name for you to call the object in memory.
    BigDecimal bd1 = new BigDecimal("3.4");
    // Person p2 = new BigDecimal(7.3);

    // new Person();    // 不保留名稱, 無法 call over object, 但依然可 operate programme.
    // create an person object in memory, but without a name for later use.

    Person p3 = new Person("Vincent Lau", 100, "vincentlau@yahoo.com.hk", "B123456", "M");

    p1.setAge(17);    
    // p1 是呼喚 object p1, "." 是 goes to object, 
    // "setAge" 是將 attribute 放入 object 的動作, "17" 是想 define 的 attribute.

    System.out.println(p1.getAge());      // 17
    System.out.println(isElderly(p1));    // false

    System.out.println(p3.getAge());      // 100
    System.out.println(isElderly(p3));    // true

  }
}
