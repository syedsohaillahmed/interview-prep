public class ReverseNumber {
    static void main() {
        int number = 123;
        int revNumber=0;
        while (number>0){
            int rem = number%10;
            revNumber= revNumber*10+rem;
            number=number/10;

        }
        System.out.println(revNumber);
    }
}
