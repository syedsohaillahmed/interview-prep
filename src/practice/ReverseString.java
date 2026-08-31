package practice;

public class ReverseString {

    static void main() {
        String sr1 = "sohail ahmed";
       char[] ch =  sr1.toCharArray();
//       for(int i=ch.length-1;i>=0; i-- ){
//           System.out.print(ch[i]);
//       }
StringBuilder sb = new StringBuilder();
        for (int j = sr1.length()-1; j>=0; j--) {
            char ch2 = sr1.charAt(j);
            sb.append(ch2);
//            System.out.print(ch2);
        }
        System.out.println(sb.toString());

    }
}
