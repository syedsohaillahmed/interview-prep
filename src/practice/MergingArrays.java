package practice;

public class MergingArrays {
    static void main() {
        int[] arr1 = {1,8,9,10,11,12};
        int[] arr2 = {3,4,5,6,7};

        int[] mergeArray = new int[arr1.length+arr2.length];

        int ar1P = 0;
        int ar2P = 0;
        int mergeArrayP = 0;

        while (ar1P<arr1.length && ar2P<arr2.length ){
            if(arr1[ar1P]<arr2[ar2P]){
                mergeArray[mergeArrayP] = arr1[ar1P];
                ar1P++;
            }else {
                mergeArray[mergeArrayP] = arr2[ar2P];
                ar2P++;
            }

            mergeArrayP++;
        }

        while (ar1P<arr1.length){
            mergeArray[mergeArrayP]=arr1[ar1P];
            ar1P++;
            mergeArrayP++;
        }

        while (ar2P< arr2.length){
            mergeArray[mergeArrayP]=arr2[ar2P];
            ar2P++;
            mergeArrayP++;
        }

        for (Integer num: mergeArray){
            System.out.print(num +", ");
        }

    }
}
