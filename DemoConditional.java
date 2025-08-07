public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    int x = 10;
    if (x > 12) {
      System.out.println("hello");
    } else {// x <= 12
      System.out.println("goodbye");
    }

    // declare y = any number;
    // declare counter
    // check if double value > 999.5, counter + 1, otherwise, counter + 2
    // print out counter
    double y = 1000;
    int counter = 0;
    if (y > 999.5){
      counter = counter + 1;
    } else {
      counter = counter + 2;
    }
    System.out.println(counter);  // 1

    // and or
    int a = 10;
    int b = 90;

    // ! && means "and"
    if (a > 5 && b > 80) {
      System.out.println("do something...");    // print
    } else {
      System.out.println("do something else");
    }
    
    // ! || means "or"
    // &&(and) has higher priority over ||(or).
    // a > 9 && b > 90 => true && false => false
    // b % 2 == 0 => true
    // Finally:  false || true => true
    if (a > 9 && b > 90 || b % 2 == 0) {
      System.out.println("correct");
      } else {
        System.out.println("incorrect");
      }

    int age = 66;
    // char gender = 'F';
    // char smoker = 'Y';
    // try to define gender and smoker as boolean
    boolean isMale = false;
    boolean isSmoker = true;
    double premium = 100.0;

    // Conditions:
    // 1) Female --> 10% extra premium
    // 2) Smoker --> 15% extra premium
    // 3) Age > 50 and Male --> 8% extra premium
    // Please calculate the amount of premium.
    double extraPremiumPercent = 0.0;
    if (isMale) {
      if (age > 50) {
        extraPremiumPercent = extraPremiumPercent + 8.0;
      } if (isSmoker) {
        extraPremiumPercent = extraPremiumPercent + 15.0;
      }
    } else {    // Female
      extraPremiumPercent = extraPremiumPercent + 10.0;
      if (isSmoker) {
        extraPremiumPercent = extraPremiumPercent + 15.0;
      }
    }
    premium = premium * (100 + extraPremiumPercent) / 100.0;
    System.out.println(premium);

  }

}