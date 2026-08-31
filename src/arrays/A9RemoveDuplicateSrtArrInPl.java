package arrays;

public class A9RemoveDuplicateSrtArrInPl {
    static void main() {
        int [] arr = {1,1,2,3,4,4,4,5,6,7};
        int rd = 0;
        for (int i = 1; i < arr.length; i++) {

            if(arr[rd] != arr[i] ){
                rd++;
                arr[rd]=arr[i];
            }
        }

        for (int i = 0; i <= rd; i++) {
            System.out.print(arr[i]+", ");
        }

    }
}
