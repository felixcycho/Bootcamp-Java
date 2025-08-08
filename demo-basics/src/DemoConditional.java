public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    // if, if-else, if-else if, if-else if-else
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

    // Female && Smoker --> 25%
    // Female && Non-smoker --> 10%
    // Male + 50 aged + Smoker --> 15%
    // Male + 51 aged + Smoker --> 23%
    // Male + 50 aged + Non-smoker --> 0%
    // Male + 51 aged + Non-smoker --> 8%
    double extraPremiumPercent = 0.0;
    if (isMale) {     // "if (isMale)" defaults "if (isMale == true)"
       // if (!isMale) checks if isMale is false
      if (age > 50) {
        // extraPremiumPercent = extraPremiumPercent + 8.0;
        extraPremiumPercent += 8.0;
      }
    } else {    // Female
      // extraPremiumPercent = extraPremiumPercent + 10.0;
      extraPremiumPercent += 10.0;
    }

    if (isSmoker) {    // "if(isSmoker)" defaults "if (isSmoker == true)"
      // if (!isSmoker) defaults checking if isSmoker is false
      // extraPremiumPercent = extraPremiumPercent + 15.0;
      extraPremiumPercent += 15.0;
    }
    premium = premium * (100 + extraPremiumPercent) / 100.0;
    System.out.println(premium);

    // if-else if-else
    int score = 95;
    char grade = ' ';
    // A: 90 or above
    // B: 80 - 89
    // C: 70 - 79
    // F: <70
    if (score >= 90) {
      grade = 'A';
    } else 
      if (score >= 80) {
        grade = 'B';
    } else 
      if (score >= 70) {
        grade = 'C';
    } else {
        grade = 'F';
    }
    System.out.println("Grade is " + grade);

    boolean isElderly = false;
    // isMale has been defined as a boolean valuable, in above.
    // A defined variable cannot be defined as the same type twice, 
    // nor defined as a different type.
    isMale = true;

    if (isElderly) {    // if isElderly is true, is an elderly

    } else {    // if isElderly is false, not an elderly
      if (isMale) {

      } else {

      }

    }

    // score has already been defined as int variable, in above.
    // cannot define score as int variable twice.
    score = 75;
    // ! "case" can only check equals value, NO range checking
    // ! switch cannot carry out AND / OR checking
    // ! switch can only check single condition.

    // Bad example of switch
    switch (score) {
      case 91:
        grade = 'A';
      case 92:
        grade = 'A';
      case 93:
        grade = 'A';
    }
    
    // Good example of switch
    char color = 'R';
    // ! By default, run all code blocks after meet the condition.
    // ! Have to break it manually to exit the switch.
    // Otherwise, all the following three sentences would be printed out.
    // Thus, break should be cooperative with switch.
    switch (color) {
      case 'R':
        System.out.println("It is red.");
        break;
      case 'G':
        System.out.println("It is green.");
        break;
      case 'B':
        System.out.println("It is blue.");
        break;

    // Conclusion:
    // 1. Only applicable to check finite values (有限數).
    //    e.g. 星期幾 (only 7 conditions), 新界/香港/九龍 (3 conditions), etc
    //    Not applicable to check 18 區 (18 conditions -> check 18 times)
    //    If check infinite values, suggest to use "if-else" rather than "switch"



    }


  }

}

// Program:  Run time?  readability?  Development time?