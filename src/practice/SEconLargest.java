package practice;

public class SEconLargest {
    static void main() {
        int [] arr = {20,2,7,89,12,6,99,100,7,8};
        int largest = getLargestNumber(arr);
        System.out.println(largest);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==largest){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondLargest = getLargestNumber(arr);

        System.out.println(secondLargest);

    }

    public static int getLargestNumber(int [] array){
        int largestNumber = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i]>largestNumber) largestNumber=array[i];
        }
        return largestNumber;
    }
}
