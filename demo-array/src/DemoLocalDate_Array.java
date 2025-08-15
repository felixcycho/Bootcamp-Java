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
    System.out.println(yearEnd.plusMonths(2L));    // 2000-02-29
    System.out.println(yearEnd.plusYears(1L));    // 2000-12-31
    System.out.println(yearEnd.minusMonths(1L));    // 1999-11-30
    System.out.println(yearEnd.minusYears(2L));    // 1997-12-31

    System.out.println(firstDateOfYear);    // 2000-01-01  本身已有 toString 效果
    System.out.println(firstDateOfYear.toString());    // 2000-01-01
    System.out.println(firstDateOfYear.isLeapYear());    // true  本身已自動計算是否閏年

    LocalDate today = LocalDate.now();    // read running machine system time
    System.out.println(today.getDayOfWeek());    // Weekday of today (i.e. TUESDAY)

    // check if today is after a date input
    System.out.println(today.isAfter(LocalDate.of(2025, 8, 11)));    // true
    System.out.println(today.isAfter(LocalDate.of(2025, 12, 11)));    // false
    System.out.println(today.isBefore(LocalDate.of(2025, 8, 11)));    // false
    System.out.println(today.isBefore(LocalDate.of(2025, 12, 11)));    // true
    System.out.println(today.isEqual(LocalDate.of(2025, 8, 11)));    // false
    System.out.println(today.isEqual(LocalDate.of(2025, 12, 11)));    // false

    System.out.println(today.getYear());    // 2025
    System.out.println(today.getMonth());    // AUGUST
    System.out.println(today.getMonth().ordinal());    // 7, means August (0 - 11)
    System.out.println(LocalDate.of(2025, 1, 1).getMonth().ordinal());    // 0, means January

  }
}
