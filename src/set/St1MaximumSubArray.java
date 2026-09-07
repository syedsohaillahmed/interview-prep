package set;

import java.util.HashSet;

public class St1MaximumSubArray {
    static void main() {
        String s = "programming";

//        we will have two pointer left and right both start at zero;
//        we will move right till the end and while iterating we will add those elements in set
//        add condition before iterating in while if we have that word alredy resent in set we will remove that and move ahead;
//        then we can check maxium distnce right -left  of +1 bcz index

        int left = 0;
        int maxSum = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxSum = Math.max(maxSum, right - left + 1);
        }

        System.out.println(maxSum);
    }
}
