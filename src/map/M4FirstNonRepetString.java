package map;

import java.util.HashMap;

public class M4FirstNonRepetString {
    static void main() {
//        approach
//        first loop put elements inside map charecter and thier frequencey
//        second loop run alog string see if that charecter present in map only 1 time
        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if(map.get(ch)==1){
               System.out.println(ch);
               break;
           }

        }


    }
}
