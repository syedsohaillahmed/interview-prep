package map;

import java.util.HashMap;
import java.util.Map;

public class M2FrequenceyOfCharecters {
    static void main() {
        String s = "programming";

        char[] chars = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);

            }else{
                map.put(chars[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> data: map.entrySet()){

            System.out.println(data.getKey() +"==>"+ data.getValue());
        }
    }
}
