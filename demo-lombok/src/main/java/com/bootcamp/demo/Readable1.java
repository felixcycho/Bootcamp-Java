package com.bootcamp.demo;

@FunctionalInterface         // 可以不寫 @FunctionalInterface, 因為 JVM 已默認 Functional Interface.
                               // But, 有風險, if Readable1 is Functional Interface, 將不得 run two methods or more.
public interface Readable1 {
  void read();
  // void sleep();

  // ! Design Approach (! safe approach)
  // Java 8
  default void teach() {
  System.out.println("By default teach() method.");
  }

  // Java 8
  // by default public
  static int sum(int x, int y) {
  // but, if not define "static", then by default instance method
    return x + y;
  }


}
