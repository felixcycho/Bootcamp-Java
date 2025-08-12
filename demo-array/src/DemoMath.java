public class DemoMath {
  public static void main(String[] args) {
    
    double pi = Math.PI;    // Math.PI is 3.141592......
    double radius = 3.5;
    double circleArea = radius * radius * pi;
    circleArea = Math.pow(radius, 2.0) * Math.PI;
    System.out.println(circleArea);    // 38.4845......

    double base = 3.5;
    double height = 4.5;
    double triangleArea = (base * height) / 2;
    System.out.println(triangleArea);    // 7.875

    // absolute value
    System.out.println(Math.abs(-9));    // 9,  return int
    System.out.println(Math.abs(-9.5));    // 9.5, return double
    System.out.println(Math.abs(9));    // 9, return int
    System.out.println(Math.abs(9.5));    // 9.5,  return double

    // power of
    // 2 ^ 10
    System.out.println(Math.pow(2.0, 10.0));    // 1024.0,  return double
    System.out.println(Math.pow(2, 10));        // 1024.0,  return double
    // 2 ^ -2
    System.out.println(Math.pow(2.0, -2.0));    // 0.25,  return double
    System.out.println(Math.pow(2, -2));        // 0.25,  return double

    System.out.println(Math.ceil(3.5));    // 4.0
    System.out.println(Math.ceil(3.1));    // 4.0
    System.out.println(Math.floor(3.5));    // 3.0
    System.out.println(Math.floor(3.9));    // 3.0

    System.out.println(Math.round(3.4));    // 3,  return long value
    System.out.println(Math.round(3.5));    // 4,  return long value
    System.out.println(Math.round(3.14));    // 3,  return long value
    System.out.println(Math.round(3.15));    // 3,  return long value
    
    // 3.145 --> 3.150  (round 2 decimal places)
    double d1 = 3.145;
    // Any value would become long value after rounded.
    System.out.println(Math.round(d1 * 100));    // 315
    System.out.println(Math.round((d1 * 100.0) / 100.0));    // 3
    System.out.println(Math.round((double)(d1 * 100.0)) / 100.0);    // 3.15
    System.out.println(Math.round((double)(d1 * 100.0 / 100.0)));    // 3

    // square-root
    System.out.println(Math.sqrt(81));    // 9.0
    System.out.println(Math.sqrt(80));    // 8.9442719......

    System.out.println(Math.random());    // Any double value from 0.0 to 0.9999.....
    // random 0 - 100
    System.out.println(Math.floor(Math.random() * 100));    // e.g. Any double value <= 100, e.g. 69.0
    System.out.println((int)(Math.random() * 100));    // Any integer <= 100, e.g. 62
    // 10 - 100
    System.out.println((int)(Math.random() * 100) + 10);   // Any integer between 10 and 110
    // 10 - 80
    System.out.println((int)(Math.random() * 70) + 10);   // Any integer between 10 and 80


  }
}