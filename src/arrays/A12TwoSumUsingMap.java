package arrays;

import java.util.HashMap;
import java.util.Map;

public class A12TwoSumUsingMap {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target =11;
        int[] matchingpair = getMatchingpair(arr, target);
        for(Integer num:matchingpair){
            System.out.print(num+", ");
        }
    }

    public static int[] getMatchingpair(int [] arr,int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int compliment = target-arr[i];

            if(map.containsKey(compliment)){
                return new  int[] {map.get(compliment), i};
            }

            map.put(arr[i], i);


        }
        return new int[]{-1, -1};

    }
}
