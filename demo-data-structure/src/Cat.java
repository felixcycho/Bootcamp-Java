import java.util.Objects;

public class Cat {
  private String name;
  private int age;

  public Cat(String name) {
    this.name = name;
  }

  public Cat(String name, int age) {
    this.name= name;
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

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Cat)) return false;
      Cat cat = (Cat) o;
      // System.out.println(cat);             // 1ms 起跳, 每次運行此句, 會令系統崩潰.
      return Objects.equals(this.name, cat.getName())
        && Objects.equals(this.age, cat.getAge());
  }

  @Override
  public String toString() {
    return "Cat ("
    + "name = " + this.name //
    + ", age = " + this.age //
    + ")";
  }

}
