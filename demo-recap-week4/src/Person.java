// ! Person -> Pocket -> int
// Person -> find pocket

public class Person {
  private Pocket pocket;
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Pocket getPocket() {
    return this.pocket;
  }

  public void addPocket() {
    this.pocket = new Pocket();
  }

  public boolean saveMoney(int money) {
    if (this.pocket != null) {
      this.pocket.add(money);
      return true;
    }
    return false;
  }

  public int getMoney() {
    return this.pocket.getMoney();
  }

  public static void main(String[] args) {
    Person john = new Person("John");
    john.saveMoney(100);
  }
}
