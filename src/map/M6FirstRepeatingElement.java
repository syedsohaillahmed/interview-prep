package map;

import java.util.HashMap;

public class M6FirstRepeatingElement {
    static void main() {
        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch)>1){
                System.out.println("first repeating element "+ch);
                break;
            }
        }
    }
}
