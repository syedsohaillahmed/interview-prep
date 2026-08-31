package practice;

public class MoveAllZeros {
    static void main() {
        int[] arr = {0,2,1,3,0,1,0,9,0} ;
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if(arr[left] == 0 && arr[right]!=0){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if(arr[left] !=0){
                left++;
            }

            if(arr[right]==0){
                right--;
            }
        }

        for (Integer num: arr){
            System.out.print(num+", ");
        }
    }
}
