import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static class Employee {
    private int id;
    private String department;            // IT, HR, Marketing

    public Employee(int id, String department) {
      this.id = id;
      this.department = department;
    }

    public int getId() {
      return this.id = id;
    }

    public String getDepartment() {
      return this.department = department;
    }

    @Override
    public String toString() {
      return "Employee ("
      + "id = " + this.id
      + ", department = " + this.department
      + ")";
    }


  }
  public static void main(String[] args) {
    Employee e1 = new Employee(101, "IT");
    Employee e2 = new Employee(102, "Marketing");
    Employee e3 = new Employee(103, "IT");
    Employee e4 = new Employee(104, "HR");
    Employee e5 = new Employee(105, "HR");
    Employee e6 = new Employee(106, "HR");

    List<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    employees.add(e4);
    employees.add(e5);
    employees.add(e6);

    // Grouping by Department, counting number of employees in Department
    Map<String, Long> departmentMap
      = employees.stream()                 // stream <Employee>
        .collect(Collectors.groupingBy(
         e -> e.getDepartment(),           // key
         Collectors.counting()             // value
        ));          
    System.out.println(departmentMap);

    Map<String, Long> departmentMap2 = new HashMap<>();
    for (Employee employee : employees) {
      // put get
      departmentMap2.put(employee.getDepartment(),
        departmentMap2.getOrDefault(employee.getDepartment(), 0L) + 1L);
    }
    System.out.println(departmentMap2);

    Map<String, Long> departmentMap3 = new HashMap<>();
    for (Employee employee : employees) {
      // put get
      long employeeCount = departmentMap3.getOrDefault(employee.getDepartment(), 0L) + 1L;
      departmentMap3.put(employee.getDepartment(), employeeCount);
    }
    System.out.println(departmentMap3);

    // ! Group by --> counting, sum(age), max(age), min(age), average(age)

    Map<Boolean, List<Employee>> departmentMap4 
      = employees.stream()
        .collect(Collectors.partitioningBy(
          employee -> "IT".equals(employee.getDepartment())
          || "Marketing".equals(employee.getDepartment())
        ));
    System.out.println(departmentMap4);

    // List<String> -> Map<String, Integer>
    List<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    Map<String, Integer> fruitMap 
      = fruits.stream()
        .collect(Collectors.toMap(e -> e, e -> e.length()));
    System.out.println(fruitMap);                            // {banana=6, orange=6, apple=5}

    Stream<Integer> integers2 = Stream.of(10, 9, -3, 6);
    // !  java.lang.IllegalStateException: stream has already been operated upon or closed
      // once you have terminated the stream, you would no longer to perform intermediate operator.
        // For example, after collect(), the stream object has been closed.
    Stream<Integer> integers3 = integers2.filter(e -> e % 2 == 1);          // ! error
    System.out.println(integers3);                                          // java.util.stream.ReferencePipeline亂碼

    List<Integer> result = integers3.collect(Collectors.toList());          // Collectors would terminate the stream.
                                                                              // since then, the stream cannot be used again.
    System.out.println(result);                                             // [9]

    boolean hasNegativeThree 
      = Stream.of(10, 9, -3, 6).anyMatch(e -> e == -3 || e == 6);
    System.out.println(hasNegativeThree);                                   // true

    // Stream --> 可執行 filter(), map(), sort(), distinct(), 最後就 collect().
      // 一旦 stream 被 collected, 則 stream 生涯完結.
    // List --> stream()


  }
}
