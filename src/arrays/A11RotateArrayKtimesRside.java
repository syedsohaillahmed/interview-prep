package arrays;

public class A11RotateArrayKtimesRside {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int k=11;
         k=k%arr.length;

        reverseArray(arr, arr.length-k, arr.length-1);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, 0, arr.length-1);
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
