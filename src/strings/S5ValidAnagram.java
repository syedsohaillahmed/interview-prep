package strings;

public class S5ValidAnagram {

    public static void checkAnagram(String s1, String s2){
        int [] array = new int[26];
        System.out.println(array.length);

        for (int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i) - 'a']++;
        }

        for(Integer i: array){
            System.out.print(i+" ");
        }

        for (int i = 0; i < s2.length(); i++) {
            array[s2.charAt(i) - 'a']--;
        }
        System.out.println();
        for(Integer i: array){
            System.out.print(i+" ");
        }

        for (Integer num:array){
            if(num!=0){
                System.out.println("not anagram");
            }
        }
        
    }

    static void main() {
        String s1= "anagram";
        String s2 = "nagarams";
        checkAnagram(s1, s2);


    }
}
