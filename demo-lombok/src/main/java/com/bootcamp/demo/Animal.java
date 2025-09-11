package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor           // 有需要時, 可放入 empty constructor, but 最好不用
@Getter
@Setter
@ToString
@EqualsAndHashCode                        // ! 
public abstract class Animal {
  private int age;

  // public Animal(int age) {      // 因為有 @AllArgsConstructor
  //  this.age = age;
  // }

}
