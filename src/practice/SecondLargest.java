package practice;

public class SecondLargest {
    static void main() {
        int[] arr = {20, 2, 7, 89, 12, 6, 99, 100, 7, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest=arr[i];
            }else if (arr[i]> secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);

    }
}
