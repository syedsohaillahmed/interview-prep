package arrays;

public class A19SquareNSortSortedArray {
    static void main() {
        int [] array = {-34, -2, -1, 9,10,27};

        int left =0;
        int right = array.length-1;
        int resPos = array.length-1;
        int [] result = new int[array.length];

        while(left<=right){
            int leftSqr = array[left]*array[left];
            int rightSqr = array[right]*array[right];

            if(rightSqr>leftSqr){
                result[resPos--] = rightSqr;
                right--;
            }else {
                result[resPos--] =leftSqr;

                left++;
            }

        }
        for (Integer data: result){
            System.out.print(data + ", ");
        }
    }

}
