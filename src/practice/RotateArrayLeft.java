package practice;

public class RotateArrayLeft {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k =3;
        int right = arr.length-1;
        int left=0;
//        reverseArray(arr, 0, k-1);
//        reverseArray(arr, k, arr.length-1);
//        reverseArray(arr, left, right);

        reverseArray(arr, arr.length-k, right);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, left, right);

        for (Integer num: arr){
            System.out.print(num+",");
        }

    }

    public static void reverseArray(int[] array,int left, int right ){
        while (left<right){
            int temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
    }
}
