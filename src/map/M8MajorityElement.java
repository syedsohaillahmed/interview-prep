package map;

import java.util.HashMap;
import java.util.Map;

public class M8MajorityElement {
    static void main() {
        int[] array = {2,2,3,1,1,1,1,5,6,1,2,1,1};
        int length = array.length;
        int majority = length/2;
        System.out.println(majority);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        for (Map.Entry<Integer,Integer> data: map.entrySet()){
            if (data.getValue()>majority){
                System.out.println(data.getKey());
            }
        }
    }
}
