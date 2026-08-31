package arrays;

public class A17AvrgSUbArrSlWnd {
    static void main() {
        int [] arr = {1,10,32,3,-1,31,12,6,9,-20};
        int k=3;

        int wSum=0;
        for (int i = 0; i < k; i++) {
            wSum=wSum+arr[i];
        }
        int mSum=wSum;

        for (int i=k; i<arr.length; i++){
            wSum = wSum - arr[i-k] + arr[i];
            if(wSum>mSum){
                mSum=wSum;
            }
        }
        System.out.println(mSum);
        double maxAverage = (double) mSum/k;
//        max average of subarray
        System.out.println(maxAverage);

    }
}
