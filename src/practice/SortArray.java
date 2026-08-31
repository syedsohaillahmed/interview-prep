package practice;

public class SortArray {
    static void main() {
        int[] arr = {20,2,7,89,12,6,99,100,7,8};
        sortArray(arr);
for (Integer num: arr){
    System.out.print(num+", ");
}
    }

    public static void sortArray(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
