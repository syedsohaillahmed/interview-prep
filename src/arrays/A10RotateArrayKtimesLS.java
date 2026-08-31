package arrays;

public class A10RotateArrayKtimesLS {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int length = arr.length;
        int k=3;
        k=k%length;
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, length-1);
        reverseArray(arr, 0, length-1);





        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }




    }

    public static void reverseArray(int [] array,int left,int right){
        while (left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right]=temp;
            left++;
            right--;
        }

    }
}
