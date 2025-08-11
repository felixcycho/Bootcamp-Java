import java.time.LocalDate;
// 當我 input LocalDate 公式後, 按下 enter 鍵, 則自動彈出第一句.

public class DemoLocalDate {
  public static void main(String[] args) {

    // number, String, boolean, etc.
    String birthday = "01-JAN-1999";
    // + 1 year
    LocalDate yearEnd = LocalDate.of(1999, 12, 31);
    // yearEnd.plusDays() defaults long value.
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(firstDateOfYear);    // 2000-01-01  本身已有 toString 效果
    System.out.println(firstDateOfYear.toString());    // 2000-01-01
    System.out.println(firstDateOfYear.isLeapYear());    // true  本身已自動計算是否閏年

    


  }
}
