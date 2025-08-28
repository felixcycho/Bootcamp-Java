package src.enum1;

// Monday --> String? int? char?
// Direction --> String? int? char?
// Color --> Red, Blue, Yellow --> String?  but how about yellow? Yellow? YELLOW? Yello?
// Enum, is coding.
// If the developer ensures the coding will not be frequently amended or revised, then enum is suitable.
// Otherwise, amending or revising enum is amending or revising coding.
// But, if the elements are just stored as String, then even though amend, revise, add or delete,
// just amending or revising the String, or Array / ArrayList, not the whole coding.
// Amending or revising coding, is one of disadvantages of enum.

// One of advantages of enum, is when two objects are NEW created, and these two objects are identical,
// e.g. two RED books, then just one object is NEW created, and the other object use the memory of the created object,
// But, if two objects are NEW created by String, then two objects are NEW created. Thus, memory is doubly occupied.
public enum Color {
  RED, BLUE, YELLOW;
  
}
