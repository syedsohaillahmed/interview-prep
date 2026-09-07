package strings;

import java.util.HashSet;

public class S7MaxSubString {
    static void main() {
//        String s ="prewwdwiwqkmcop";
//        String s = "abcabcbb";  //3
        String s = "abdef";  //5
        int left =0;
        int maxSum = 0;

        HashSet<Character> set = new HashSet<>();


        for(int right =0; right<s.length(); right++){

            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxSum = Math.max(maxSum, right-left+1);

        }

        System.out.println(maxSum);

    }
}
