package strings;

public class S1ReverseString {
    static void main() {
        String str = "lion heart";

//        using toCharArray which will convert string to chaecter Array
//        char[] charArray = str.toCharArray();

//        for (int i = charArray.length-1; i >=0; i--) {
//            System.out.print(charArray[i]);
//        }

//        second method using chartAt

//        for (int i = str.length()-1; i >=0; i--) {
//            System.out.print(str.charAt(i));
//        }

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        StringBuilder sbl = new StringBuilder(str);
        System.out.println(sbl.reverse());


    }
}
