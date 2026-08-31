package arrays;

public class A13MergeTwoSortedArray {
    static void main() {
        int[] arr1 = {3,4,5,6,7};
        int[] arr2 = {1,8,9,10,11,12};
        int[] marr = new int[arr1.length+arr2.length];

        int a1p=0;
        int a2p=0;
        int map=0;

        while (a1p<arr1.length && a2p<arr2.length){

            if(arr1[a1p]<arr2[a2p]){
                marr[map]=arr1[a1p];
                a1p++;
            }else {
                marr[map]=arr2[a2p];
                a2p++;
            }
            map++;
        }

        while (a1p<arr1.length){
            marr[map]=arr1[a1p];
            a1p++;
            map++;
        }

        while (a2p<arr2.length){
            marr[map]=arr2[a2p];
            a2p++;
            map++;
        }

        for (Integer num:marr){
            System.out.print(num+", ");
        }


    }
}
