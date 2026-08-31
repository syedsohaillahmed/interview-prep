package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M7GroupAnagram {
    static void main() {
        String [] str = {"eat", "ate", "tops", "spot", "opts", "shaba", "basha", "stop", "cope"};
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: str){
//            System.out.println(s);

            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String key = new String(ch);
            if (map.containsKey(key)){
                map.get(key).add(s);
            }else {
                ArrayList<String> list= new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }




        }

        System.out.println(map);
    }
}
