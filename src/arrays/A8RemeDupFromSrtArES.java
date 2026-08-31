package arrays;

public class A8RemeDupFromSrtArES {
    static void main() {
        int [] arr = {1,1,2,3,4,4,4,5,6,7};
        int [] temp = new int[arr.length];
        int rd= 0;
        temp[rd] = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(temp[rd] != arr[i] ){
                rd++;
                temp[rd]=arr[i];
            }
        }

        for (Integer num : temp) {
            System.out.print(num + ", ");
        }
    }
}
