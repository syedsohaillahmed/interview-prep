package practice;

public class ReverseWords {
    static void main() {
        String sr = "hello world i am doing great";
        String[] sarray = sr.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = sarray.length-1; i >=0 ; i--) {
            sb.append(sarray[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
