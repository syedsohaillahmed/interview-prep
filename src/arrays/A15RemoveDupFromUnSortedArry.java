package arrays;

import java.util.LinkedHashSet;

public class A15RemoveDupFromUnSortedArry {
    static void main() {
        int[] arr = {0,2,1,3,0,1,0,9,0} ;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

    }
}
