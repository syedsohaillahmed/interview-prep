package map;

import java.util.HashMap;
import java.util.Map;

public class M1FrequenceyOfInteger {
    static void main() {
        int[] array = {1,2,2,3,1,4,9,6,7,8,1,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> data: map.entrySet()){
            System.out.println(data.getKey()+"==> "+data.getValue());

        }
    }
}
