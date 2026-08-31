package arrays;

public class A4ReverseAnArray {
    static void main() {
        int[] arr = {20,2,7,89,12,6,99,100,7,8};
        reverseArray(arr);
    }

    public static void reverseArray(int [] array){
        int left = 0;
        int right = array.length-1;

        while (left<right){
            int temp = array[left];
            array[left]=array[right];
            array[right]=temp;

            left++;
            right--;
        }

        for(Integer num: array){
            System.out.print(num+", ");
        }

    }
}
