package strings;

public class S4ReverseEachWord {
    static void main() {
//        approach is first split the string which will give string array
//        then each string reverse it and append it

        String str = "hello world";
        String[] words =  str.split(" ");
        String reveresedWords = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revrse = "";

            for (int j= word.length()-1; j>=0; j--){
                char ch = word.charAt(j);
                revrse=revrse+ch;
            }

            reveresedWords = reveresedWords+revrse+" ";
        }

        System.out.println(reveresedWords);
    }
}
