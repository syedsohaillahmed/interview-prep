package streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EMPMAin {

    static void main() {
        List<EmployeePractice> employees = Arrays.asList(

                new EmployeePractice(1, "Rahul", "Sharma", "560001",
                        "Bangalore", 28),

                new EmployeePractice(2, "Priya", "Patel", "560002",
                        "Bangalore", 30),

                new EmployeePractice(3, "Rahul", "Sharma", "560001",
                        "Bangalore", 28),

                new EmployeePractice(4, "Amit", "Kumar", "110001",
                        "Delhi", 35),

                new EmployeePractice(5, "Sneha", "Reddy", "500001",
                        "Hyderabad", 27),

                new EmployeePractice(6, "Rahul", "Sharma", "560003",
                        "Bangalore", 29),

                new EmployeePractice(7, "Amit", "Kumar", "110001",
                        "Delhi", 35),

                new EmployeePractice(8, "Priya", "Patel", "560002",
                        "Bangalore", 30),

                new EmployeePractice(9, "Vikram", "Singh", "400001",
                        "Mumbai", 32),

                new EmployeePractice(10, "Sneha", "Reddy", "500002",
                        "Hyderabad", 28),

                new EmployeePractice(11, "Amit", "Kumar", "110002",
                        "Delhi", 36),

                new EmployeePractice(12, "Vikram", "Singh", "400001",
                        "Mumbai", 32)
        );

        System.out.println(employees);

        Map<String, List<String>> collect = employees.stream()
                .collect(Collectors.groupingBy(
                                e -> e.getFirstName() +" "+ e.getLastName(),
                                Collectors.mapping(EmployeePractice::getPincode, Collectors.toList())
                        )
                );

//        System.out.println(collect);

    }


}
