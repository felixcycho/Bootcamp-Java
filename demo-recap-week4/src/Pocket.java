public class Pocket {
  private int money;
  // private Color color;

  public Pocket() {
    this.money = 0;
  }

  public void add(int money) {
    this.money += money;
  }

  public int getMoney() {
    return this.money;
  }

  public boolean deduct(int money) {
    if (this.money < money)
      return false;
    this.money -= money;
    return true;
  }
}
