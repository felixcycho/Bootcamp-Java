package com.bootcamp.demo;

import java.time.LocalDate;
import java.time.Period;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
  private static int idCounter = 0;
  private int id;
  private String name;
  private LocalDate dateOfBirth;

  public Student(String name, LocalDate dateOfBirth) {
    this.id = ++idCounter;                        // Increment and assign the ID
    this.name = name;
    this.dateOfBirth = dateOfBirth;
  }

  public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }

  // Builder method
  public class StudentBuilder {
    public Student build() {
      // Call the private constructor to create a Student instance
      return new Student(name, dateOfBirth);
    }
  }

}
