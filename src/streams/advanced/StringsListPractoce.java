package streams.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsListPractoce {
    static void main() {
        List<String> names = Arrays.asList(
                "John", "Alice", "Bob", "David", "Emma"
        );

//print all strings
//        names.stream()
//                .forEach(s -> System.out.println(s));

//        print string length .4
//        names.stream().filter(ame-> ame.length()>4)
//                .forEach(System.out::println);

//        convert all to upper case
        List<String> list = names.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(list);

        List<String> list1 = list.stream().filter(s -> s.startsWith("A")).toList();

//        longest string
        String s1 = names.stream()
                .max(Comparator.comparing(s -> s.length()))
                .orElse(null);

        System.out.println(s1);

        Optional<String> min = names.stream().min(Comparator.comparing(s -> s.length()));
        System.out.println(min.get());


//        next level

        List<String> words = Arrays.asList(
                "banana", "apple", "orange", "kiwi", "grape", "apple"
        );

        Map<Integer, List<String>> collect3 = words.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect3);


//        remove duplicate strings
        List<String> list2 = words.stream().distinct().toList();
        System.out.println(list2);

//        sort strings alphabetically
        List<String> list3 = words.stream()
                .sorted()
                .toList();
        System.out.println(list3);

//        sort string by length
        List<String> list4 = words.stream()
                .sorted(Comparator.comparing(s-> s.length()))
                .toList();

//        letter containing a
        List<String> list5 = words.stream()
                .filter(s -> s.contains("a"))
                .toList();

        Map<String, Long> collect = words.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

//        for (Map.Entry<String, Long> data: collect.entrySet()){
//            if(data.getValue()>1){
//                System.out.println(data.getKey());
//            }
//        }

        List<String> list6 = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .toList();
//        System.out.println(list6);

//        System.out.println(collect);


//
        ArrayList<String> tools = new ArrayList<>(Arrays.asList("java", "spwwring", "java", "docker", "spring"));
        System.out.println(tools);

        Map<String, Long> collect1 = tools.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect1);

        String s2 = tools.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max((a,b) -> a.getValue().compareTo(b.getValue()))
                .map(s -> s.getKey())
                .orElse(null);
        System.out.println(s2);

//        join strings with ,


        String collect2 = tools.stream().collect(Collectors.joining(", "));
        System.out.println(collect2);

//        totoal length of all the charecters

        double sum = tools.stream()
                .mapToInt(String::length)
                .average().getAsDouble();
        System.out.println(sum);

//        most frequently occuring string string

        String s3 = tools.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max((a, b) -> a.getValue().compareTo(b.getValue()))
                .map(s -> s.getKey())
                .orElse(null);
        System.out.println(s3);
    }
}
