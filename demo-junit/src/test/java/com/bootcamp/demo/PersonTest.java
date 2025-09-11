package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
  @Test
  void testPerson() {
    Person p1 = new Person("John", 13);
    Assertions.assertEquals("John", p1.getName());
    Assertions.assertEquals(13, p1.getAge());

    Person p2 = new Person("Felix", 100);
    Assertions.assertEquals(false, p1 == p2);
    Assertions.assertEquals(false, p1.hashCode() == p2.hashCode());
    Assertions.assertEquals(false, p1.equals(p2));

    p2.setName("John");
    p2.setAge(13);
    Assertions.assertEquals(false, p1 == p2);
    Assertions.assertEquals(true, p1.hashCode() == p2.hashCode());
    Assertions.assertEquals(true, p1.equals(p2));
  }
}
