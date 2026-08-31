package streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringWithStream {
    static void main() {
        String s = "programming";

//        find duplicate chareceters
        Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        List<Character> list = collect.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .toList();

//        find first non repeating charecter
        String s2 = "swiss";

        Map<Character, Long> collect1 = s2.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character c = collect1.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst().orElse(null);

        System.out.println(c);

//        convert given string to camel case
        String str = "Hello world java";
        List<String> list1 = Arrays.stream(str.toLowerCase().split("\\s")).toList();
        System.out.println(list1);
        String StringwithFirstLetterUppercase = list1.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining());
        System.out.println(StringwithFirstLetterUppercase);

        String s1 = StringwithFirstLetterUppercase.substring(0, 1).toLowerCase() + StringwithFirstLetterUppercase.substring(1);
        System.out.println(s1);

        String collect2 = Arrays.stream(str.toLowerCase().split("\\s"))
                .map(words -> words.substring(0, 1).toUpperCase() + words.substring(1))
                .collect(Collectors.joining());
        System.out.println(collect2);

    }
}
