package strings;

public class S6Palindrome {
    static void main() {
        String s1 = " yay yay ";
        String s2 = "";

        for(int i=s1.length()-1; i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("valid");
        }else{
            System.out.println("not");
        }
    }
}
