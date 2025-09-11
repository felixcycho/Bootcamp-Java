package com.bootcamp.demo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class DemoLombok {
    public static void main( String[] args )
    {
        Person p1 = new Person("John", 13);
        System.out.println(p1.getAge());                         // 13
        System.out.println(p1.getName());                        // John
        System.out.println(p1);                                  // Person(name=John, age=13)
        p1.setAge(15);                                           
        p1.setName("Mary");
        System.out.println(p1);                                  // Person(name=Mary, age=15)

        Person p2 = new Person("Mary", 15);
        System.out.println(p1.equals(p2));                       // true
        System.out.println(p1 == p2);                            // false
        System.out.println(p1.hashCode() == p2.hashCode());      // true

        Student student1 = new Student("Felix", LocalDate.of(1986, 11, 4));
        System.out.println(student1);
        System.out.println(student1.getId());
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
        System.out.println(student1.getClass());

    }
}
