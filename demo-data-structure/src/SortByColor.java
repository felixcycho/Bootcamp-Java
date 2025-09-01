import java.util.Comparator;

public class SortByColor implements Comparator<Ball2> {
  @Override
  public int compare(Ball2 o1, Ball2 o2) {
    if (o1.getColor() == Color.RED)
      return -1;
    if (o2.getColor() == Color.RED)
      return 1;
    if (o1.getColor() == Color.YELLOW)
      return -1;
    if (o2.getColor() == Color.YELLOW)
      return 1;
    return -1;
  }
}
