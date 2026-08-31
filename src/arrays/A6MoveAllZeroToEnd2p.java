package arrays;

public class A6MoveAllZeroToEnd2p {
    static void main() {
//        int [] arr = {0,2,0,0,6,5,7,8,0,3};
        int[] arr = {0, 1, 0};

        int left =0;
        int right = arr.length-1;

        while (left<right){
            if(arr[left] == 0 && arr[right] !=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

            if(arr[left] !=0){
                left++;

            }

            if(arr[right] == 0){
                right--;
            }
        }

        for (Integer num: arr){
            System.out.print(num+", ");
        }

    }
}
