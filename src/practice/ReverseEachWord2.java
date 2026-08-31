package practice;

public class ReverseEachWord2 {
    static void main() {

        String s1 = "  yo yo honey  singh  ";
        String s2 = s1.trim().replaceAll("\\s+", " ");
//        System.out.println(s2);
//
        StringBuilder sb = new StringBuilder();
        String[] words = s2.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];

            for(int j= word.length()-1; j>=0; j--){
                System.out.print(word.charAt(j));
                sb.append(word.charAt(j));
            }
            System.out.print(" ");


        }
        System.out.println(sb);

    }
}
