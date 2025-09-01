import java.util.Comparator;

// ! Write a class representing a sorting formula for a specific object
public class SortByValueDesc implements Comparator<Ball2> {

  // ! o1 => -1, o2 => 1
  @Override
  public int compare(Ball2 o1, Ball2 o2) {
    return o1.getValue() > o2.getValue() ? -1 : 1;
  }

}
