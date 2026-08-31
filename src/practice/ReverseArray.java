package practice;

public class ReverseArray {
    static void main() {

        int[] arr = {20,2,7,89,12,6,99,100,7,8};
        int[] arr2= reverseAnArray(arr);
        for(Integer num:arr){
            System.out.print(num+", ");
        }

    }

    public static int[] reverseAnArray(int [] array){
        int left = 0;
        int right = array.length-1;

        while (left<right){
            int temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        return array;
    }

}
