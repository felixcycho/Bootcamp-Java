public class Quiz0207 {
  int x;
  double y;
  String z;

  void add(double c, double d) {
    this.y = c + d + 1.0;
  }

  void add(int a, int b) {
    this.x = a + b;
  }

  void add(String e, String f) {
    this.z = e + f;
  }

  public static void main(String[] args) {
    Quiz0207 quiz0207 = new Quiz0207();
    quiz0207.add(2, 2);          // quiz0207.x => 4
    quiz0207.add(3.2d, 3.2d);    // quiz0207.y => 7.4
    quiz0207.add("5", "3.2");    // quiz0207.z => "53.2"
    System.out.println(quiz0207.x + ", " + quiz0207.y + ", " + quiz0207.z);    // 4, 7.4, 53.2


  }
}
