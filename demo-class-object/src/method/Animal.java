import java.math.BigDecimal;
import java.time.LocalDate;

// ! Object (i.e. dog, cat in this case), in Static (left) Side, can only direct to 
//   one Class (i.e. Animal), in Runtime (right) Side. It cannot direct to other Class.
// ! Object in Runtime (right) Side cannot direct to left side.
// ! Only left side can direct to right side.

// User 希望用一種 animal 搜尋牠的 date of birth, 而不是利用 date of birth 搜尋所有 animals.
public class Animal {
  // 以下稱為 Attribute (特徵), 沒有固定表達模式.
  // Attribute ()
  private LocalDate dateOfBirth;
  private int age;                   // 描述什麼是 age
  private String name;               // 描述什麼是 name
  private String kind;               // 描述什麼是 kind

  // Setter 改寫功能
  // Method --> input (optional) --> output (optional)
  // void, 意思是 No Return Type, 不像 int, LocalDate, String, ...
  public void setAge(int age) {
    this.age = age;
  }

  public void setdateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  // Getter 抽取功能
  public int getAge() {              // 向 object 取 attribute / data
  // Method Return Type: int
    return this.age;
  }

  public LocalDate getDateOfBirth() {
  // Method Return Type: LocalDate
    return this.dateOfBirth;
  }

  public static void main(String[] args) {
    // "new" --> create object
    // "Animal" --> class name
    // "()" --> constructor

    Animal dog = new Animal();
    dog.setdateOfBirth(LocalDate.of(2020, 10, 9));
    LocalDate dogDateOfBirth = dog.getDateOfBirth();
    System.out.println(dog.getDateOfBirth());    // 2020-10-09
    System.out.println(dogDateOfBirth);    // 2020-10-09

    dog.setdateOfBirth(LocalDate.of(2021, 11, 2));
    System.out.println(dog.getDateOfBirth());    // 2021-11-02
    System.out.println(dogDateOfBirth);    // 2020-10-09

    Animal cat = new Animal();
    cat.setdateOfBirth(LocalDate.of(2021, 11, 2));    // 於 of 位置, 按下 control 鍵.
    System.out.println(cat.getDateOfBirth());

    cat = dog;    
    cat.setdateOfBirth(LocalDate.of(2024, 12, 31));
    System.out.println(cat.getDateOfBirth());    // 2024-12-31
    System.out.println(dog.getDateOfBirth());    // 2024-12-31
    // 當 cat 被 dog 取代時, cat 之前的所有 attributes, 也被 dog 取代, 且回收至 AGC.
    // 從此, 世界上只有 dog, 沒有 cat.

  }
}
