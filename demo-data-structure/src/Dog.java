import java.util.Objects;

public class Dog {

  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  // hashCode and equals()
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  // 就算 沒有寫 equals(), Java implicitly defines 有寫 equals().
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Dog)) return false;
    Dog dog = (Dog) o;
      // System.out.println(dog);             // 1ms 起跳, 每次運行此句, 會令系統崩潰.
    return Objects.equals(this.name, dog.getName())
        && Objects.equals(this.age, dog.getAge());
  }

  // 不寫 toString 不會致命, 但寫咗 toString 會令文字脈絡更加順暢.
  @Override
  public String toString() {
    return "Dog (" //
    + "name = " + this.name //
    + ", age = " + this.age //
    + ")";
  }

}

