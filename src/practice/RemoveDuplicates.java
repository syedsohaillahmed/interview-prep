package practice;

public class RemoveDuplicates {
    static void main() {
        int[] arr = {1,1,2,3,4,4,5,6,6,7,7,7};
        int uniqueElement = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[uniqueElement] != arr[i]){
                uniqueElement++;
                arr[uniqueElement]=arr[i];
            }
        }

        for (int i = 0; i <= uniqueElement; i++) {
            System.out.print(arr[i]);
        }

    }
}
