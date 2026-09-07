package numbers;

public class ReverseNumber {
    static void main() {
        int num= 1101;
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }

        System.out.println(rev);
    }
}
