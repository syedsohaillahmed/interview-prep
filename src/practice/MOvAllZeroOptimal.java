package practice;

public class MOvAllZeroOptimal {
    static void main() {
        int[] arr = {0, 2, 1, 3, 0, 1, 0, 9, 0};

        int nz = 0;
        int z = 0;

        while (nz< arr.length){
            if(arr[nz] !=0 ){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }else {
                nz++;
            }
        }

        for (Integer num: arr){
            System.out.print(num+", ");
        }
    }
}
