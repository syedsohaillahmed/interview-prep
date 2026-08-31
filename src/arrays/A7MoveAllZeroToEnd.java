package arrays;

public class A7MoveAllZeroToEnd {
    static void main() {
        int[] arr = {0, 2, 0, 0, 6, 5, 7, 8, 0, 3};
        int nz = 0;
        int z = 0;


        while (nz < arr.length) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;

            } else {
                nz++;
            }
        }

        for (Integer num : arr) {
            System.out.print(num + ", ");
        }

    }
}
