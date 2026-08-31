package arrays;

public class A2SecondLargestNumberBruteForce {
    static void main() {
        int [] arr = {20,2,7,89,12,6,99,100,7,8};
        int largestNumber = getLargestNumber(arr);
        System.out.println(largestNumber);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==largestNumber){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondLargest = getLargestNumber(arr);
        System.out.println(secondLargest);

    }

    private static int getLargestNumber(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]>largestNumber){
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
}
