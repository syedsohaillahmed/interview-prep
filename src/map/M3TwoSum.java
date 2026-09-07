package map;

import java.util.HashMap;

public class M3TwoSum {
    static void main() {
        int[] array = {2,1,4,68,9,9,1,3,5,6};
        int target = 7;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <array.length ; i++) {
            int needed = target-array[i];
            if(map.containsKey(needed)){
                System.out.println(map.get(needed)+" " +i);
                break;
            }

            map.put(array[i], i);
        }

    }
}
