package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(10, 1, 2, 13, 4, 10, 2, 15));

//        remove duplicates
        List<Integer> uniqueList = iList.stream()
                .distinct().toList();
//        System.out.println(uniqueList);

//        remove duplicates sort in ascending order
        List<Integer> ascending = iList.stream()
                .distinct().sorted().toList();

        List<Integer> desc = iList.stream()
                .distinct().sorted(Comparator.reverseOrder())
                .toList();

//        find all odd numbers
        List<Integer> oddNumbers = iList.stream()
                .filter(e -> e % 2 != 0)
                .toList();

//        odd number and print there square
        List<Integer> oddandSquare = iList.stream()
                .filter(e -> e % 2 != 0)
                .map(e -> e * e).toList();

//        get 2 and 3 rd number from list
        List<Integer> secondandThird = iList.stream()
                .skip(1).limit(2).toList();

        Optional<Integer> seconHigghest = iList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();

//        System.out.println(seconHigghest.get());

//        grouping data into two setion partitionBy usefull
        Map<Boolean, List<Integer>> evenodddivision = iList.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));

//        for (Map.Entry<Boolean, List<Integer>> mapData: evenodddivision.entrySet() ){
//            System.out.println(mapData.getKey() + " -"+ mapData.getValue());
//        }

        Map<Integer, Long> groupBYFreq = iList.stream()
                .collect(Collectors.groupingBy(elem -> elem, Collectors.counting()));


        ArrayList<String> slist = new ArrayList<>(Arrays.asList("sohail", "java", "springboot", "api"));

//        longest string in list
        String longestString = slist.stream()
                .max(Comparator.comparing(s -> s.length()))
                .get();
//        System.out.println(longestString);


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

//        find employees whose salary> 50000
        Optional<Employee> first = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .findFirst();

//        find top two highest paod employee
        List<Employee> top2 = employees.stream()
                .sorted(Comparator.comparing(e -> -1 * e.getSalary()))
                .limit(2).toList();

        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Comparator.comparing(Employee::getName)))
                .limit(2).toList();

//        emp in each department

        Map<Object, Long> empInDept = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));


//  find total salary based on department
        Map<String, Double> salaryperdepartment = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingDouble(Employee::getSalary)));

        Optional<Integer> max = iList.stream().max(Integer::compareTo);

//        //find duplicate numbers
        List<Integer> list1 = iList.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();


//        System.out.println(list1);


//        string practice
        String str = "programming";
        StringBuilder sb = new StringBuilder();

//        str.chars()
//                .distinct()
//                .forEach(e -> sb.append((char) e));


//        Map<Character, Long> collect = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));



//        find duplicate
//        List<Character> list2 = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .toList();

        Character c1 = str.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
//        System.out.println(c1);

        int sum = iList.stream()
                .mapToInt(Integer::intValue)
                .sum();
//        System.out.println(sum);

        OptionalDouble average = iList.stream()
                .mapToInt(Integer::intValue)
                .average();
//        System.out.println(average.getAsDouble());

        Map<Integer, Long> collect = iList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

        List<Integer> duplicateNumbers = collect.entrySet().stream().filter(ele -> ele.getValue() > 1)
                .map(ele -> ele.getKey())
                .toList();
//        System.out.println(duplicateNumbers);

        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        Map<String, Optional<Employee>> collect2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
        System.out.println(collect2);

        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null)

                ;
//        System.out.println(employee);

//        second hoges salary
        Map<String, Employee> collect3 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lis2 -> lis2.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .skip(1)
                                        .findFirst()
                                        .orElse(null)
                        )
                ));

        Map<String, Double> collect4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Double> collect5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Optional<String> s = collect5.entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue()))
                .map(ele -> ele.getKey());

        System.out.println(s);


    }
}
