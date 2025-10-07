package Quiz0401;
public class Quiz0401 {
  static byte counter = 5;
  int beCareful = 2;
  
  public static void main(String[] args) {
    Quiz0401 q = new Quiz0401();

    for (Integer i = 0; i < 2; i++) {
      counter = (byte) (i + q.beCareful);
    }

    System.out.println(counter);             // 3
  }
}

