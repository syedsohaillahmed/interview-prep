package strings;

import java.util.HashSet;
import java.util.Set;

public class S2RemoveDuplicateCharectersFromString {
    static void main() {
        String str = "ssssssssssssssssssssssh";

//        str.chars()  str. chars() gives us input stream which means we can do stream operations
//        approach is convert string to stram then using distinct get distinct charecters then using foreach append to to a string builder

//        StringBuilder sb = new StringBuilder();
//        str.chars()
//                .distinct()
//                .forEach(c-> sb.append((char) c));  //type casted it char
////        System.out.println(sb);
//
////        second approach with help of indesxOf and charAt()
//        StringBuilder sb2 = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int idx = str.indexOf(ch, i+1);
//            if(idx == -1){
//                sb2.append(ch);
//            }
//        }
//
//        System.out.println(sb2);
////next approach
//        StringBuilder sb3 = new StringBuilder();
//
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//
//        for(Character chh: set){
//            sb3.append(chh);
//        }

//        System.out.println(sb3);
StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(s-> sb.append((char)s));
//        System.out.println(sb);

        for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           int index = str.indexOf(ch, i+1);
           if(index == -1){
               sb.append(ch);
           }

        }

        System.out.println(sb);

    }
}
