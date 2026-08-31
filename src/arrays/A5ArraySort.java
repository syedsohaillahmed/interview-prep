package arrays;

public class A5ArraySort {
    static void main() {
        int [] arr = {10,2,1,4,6,5,7,8,9,3};
        sortArray(arr);
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }

        }

        for(Integer num: array){
            System.out.print(num+", ");
        }    }
}
