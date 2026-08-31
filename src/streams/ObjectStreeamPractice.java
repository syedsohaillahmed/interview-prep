package streams;

import java.util.*;
import java.util.stream.Collectors;

public class ObjectStreeamPractice {
    static void main() {
        List<Employee> employees = Arrays.asList(

                new Employee(1, "John", "IT", 75000, 28,
                        Arrays.asList("Java", "Spring", "SQL")),

                new Employee(2, "Alice", "HR", 55000, 32,
                        Arrays.asList("Recruitment", "Communication")),

                new Employee(3, "Bob", "IT", 90000, 35,
                        Arrays.asList("Java", "AWS", "Docker")),

                new Employee(4, "David", "Finance", 65000, 40,
                        Arrays.asList("Excel", "SQL")),

                new Employee(5, "Emma", "IT", 85000, 29,
                        Arrays.asList("Java", "React")),

                new Employee(6, "Sophia", "HR", 60000, 27,
                        Arrays.asList("Recruitment", "Payroll")),

                new Employee(7, "Mike", "Finance", 70000, 45,
                        Arrays.asList("Accounting", "Excel"))


        );

//        group employees based on department
        Map<String, Long> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));

//        employees from iT department
        List<Employee> ITEmployees = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .collect(Collectors.toList());

//        employees salary having greater then 70000
        List<Employee> list = employees.stream()
                .filter(e -> e.getSalary() > 70000)
                .toList();

//        list only employee names
        List<String> list1 = employees.stream().map(e -> e.getName())
                .toList();

//        count employees in it department
        long it = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .count();

//        highest salary
//        Employee employee = employees.stream()
//                .max(Comparator.comparing(Employee::getSalary)).orElse(null);

//        lowest salry
        Employee lowSalay = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        double sum = employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .sum();


        double v = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0);
//        System.out.println(v);

//        sort employees salary ascending

        List<String> list2 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .toList();

        List<Employee> list3 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
//        System.out.println(list3);

//        group by employees on departmnt

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(collect);

//        count employees on eah department

//        Map<String, Long> collect1 = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

//        find avaerage salary by department
        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Optional<Employee>> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        List<Employee> list4 = employees.stream()
                .filter(e -> e.getSkills().contains("java"))
                .toList();


        System.out.println(ITEmployees);


    }
}
