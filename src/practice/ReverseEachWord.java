package practice;

public class ReverseEachWord {
    static void main() {
       String str = "java programming sir";
       String[] words = str.split(" ");
       String reverse = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for(int j=word.length()-1; j>=0; j--){
                char ch = word.charAt(j);
                reverseWord = reverseWord+ch;

            }
//            System.out.println(reverseWord);

            reverse=reverse+reverseWord+" ";
        }

        System.out.println(reverse);
    }
}
