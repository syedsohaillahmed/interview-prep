package strings;

public class S3ReverseWord {
    static void main() {
        String str = "hello world how are you";
        String[] s = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i =s.length-1; i >=0 ; i--) {
            sb.append(s[i]);
            if(i>0){
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
