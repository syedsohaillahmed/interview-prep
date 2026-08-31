package arrays;

public class A16MxmmSubArrSlWnd {
    static void main() {
        int [] arr = {1,10,32,3,-1,31,12,6,9,-20};
        int k=3; //window size
        int wSum=0;

//        approach here is first loop to get first windows size
//        seond loop we move ahead so it will be like remove previous add next
//        to remove previous we know  i-k will give me previous as i is current value

        for (int i=0; i<k; i++){
            wSum+=arr[i];
        }

        int mSum=wSum;
//        we have initial window size so we are staring with next so suppose k=3 [0,1,2] sum we have so next will start from k and till end
        for (int i=k;i<arr.length; i++){
            wSum= wSum-arr[i-k] + arr[i];
            if(wSum>mSum){
                mSum=wSum;
            }
        }
        System.out.println(mSum);

    }
}
