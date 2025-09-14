import java.util.ArrayList;
import java.util.List;

public class Quiz0410 {
  
  static final List<Character> characters;
  private static final char[] chars = {'J', 'A', 'C', 'K', 'Y'};
  int a = 0;

  static {
    characters = new ArrayList<>();
  }
  // execute only when New Object of current class is created

  {
    characters.add('V');
  }

  public static void main(String[] args) {
    for (char c : chars) {
      characters.add(c);
    }
    System.out.println(characters.size());               // 5
  }

}
