package src.abstraction;

// Skill or contract
// ! Bad idea using "Shape" as Interface, Shape is NOT a skill.
// Thus, Shape should not use interface
// Bad example
public interface Shape {
  // ! Interface is NO attribute
  // ! Interface has NO concrete method (public & abstract only)
  double area();    // ! implicitly public and abstract

  
} 
