package arrays;

public class A14SortSelection {
    static void main() {
        int [] arr = {10,2,11,11,1,2,6,3,2,9};
        sortBySelectionSort(arr);
    }

    private static void sortBySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
            System.out.println(arr[smallest]);
        }
    }
}
