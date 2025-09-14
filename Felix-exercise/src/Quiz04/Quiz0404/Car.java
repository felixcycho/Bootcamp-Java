class Car {
  int speed = 100;
  static Car instance = new Car();

  private Car() {

  }

  public static Car getInstance() {
    return instance;
  }

  // instance method
  public void setSpeed(int s) {
    this.speed = s;
  }
}
