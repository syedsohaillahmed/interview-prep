package map;

import java.util.HashMap;
import java.util.Map;

public class M6ValidAnagram {
    static void main() {
        String s1 = "silent";
        String s2 = "listen";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }
        System.out.println(map);

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> data:map.entrySet()){
            if(data.getValue()>0){
                System.out.println("not anagram ");
            }else {
                System.out.println("anagram");

            }
        }
    }
}
