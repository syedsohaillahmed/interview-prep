package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPractice {
    static void main() {
//        Given "programming", count how many times each character occurs.
        String s = "programming";
        Map<Character, Long> count = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(count);

//        find duplicate charecter
        List<Character> duplicateCharacters = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ele -> ele.getValue() > 1)
//                .map(elee -> elee.getKey())
                .map(Map.Entry::getKey)
                .toList();

//        System.out.println(duplicateCharacters);

//        find character occurance only once

        List<Character> nonRepeatedCharacters = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .toList();
//        System.out.println(nonRepeatedCharacters);

//        find the first occurance of non repeated character
        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        e -> e,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
//        System.out.println(map);

//        find the first occurance of repeated string
        Character firstNonRepeatingCharacter = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(firstNonRepeatingCharacter);

//        find vowels from string
        List<Character> extractedVowel = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(c)>=0)
                .toList();

//        count vowels from string
        long vowelsCountt = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();
//        System.out.println(vowelsCountt);

//        removeduplicate characters from stringu

        String uinqueString = s.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(c -> String.valueOf(c))
                .collect(Collectors.joining());
        System.out.println(uinqueString);


        String multipleWord = "java is powerfull language";
        String s1 = Arrays.stream(multipleWord.split(" "))
                .max(Comparator.comparing(sup -> sup.length()))
                .orElse(null);
        System.out.println(s1);

        String collect = '#'+Arrays.stream(multipleWord.split(" "))
                .map(stu -> stu.substring(0,1).toUpperCase() + stu.substring(1).toLowerCase()
                ).collect(Collectors.joining());
        String s2 =collect.substring(0,1)+collect.substring(1, 2).toLowerCase() + collect.substring(2);
        System.out.println(s2);


        String str = "1,2,3,1,2,5,6";
        List<Integer> list = Arrays.stream(str.split(","))

                .map(s -> Integer.parseInt(s))
                .distinct()
                .toList();
        System.out.println(list);


    }
}
