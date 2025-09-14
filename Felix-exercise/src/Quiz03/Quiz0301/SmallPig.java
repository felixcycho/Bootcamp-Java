public class SmallPig extends Pig implements Vegetarian, Runner {
  public static void main(String[] args) {
    SmallPig smallPig = new SmallPig();
    System.out.println(smallPig.eat());
  }
}
