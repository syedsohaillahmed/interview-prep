package practice;

import java.util.LinkedList;
import java.util.Queue;

public class yo {


        public static void main(String[] args) {

            int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
            int k = 3;

            Queue<Integer> negatives = new LinkedList<>();

            for (int i = 0; i < arr.length; i++) {

                // Add negative number to queue
                if (arr[i] < 0) {
                    negatives.add(arr[i]);
                }

                // Start processing once window reaches size k
                if (i >= k - 1) {

                    // First negative in current window
                    if (negatives.isEmpty()) {
                        System.out.println(0);
                    } else {
                        System.out.println(negatives.peek());
                    }

                    // Remove element leaving the window
                    if (arr[i - k + 1] < 0) {
                        negatives.poll();
                    }
                }
            }



    }
}
