package practice;

public class RemoveDuplicatesFromString {

    static void main() {
        String sr = "programming";

//        StringBuilder sb = new StringBuilder();
//        sr.chars().distinct().forEach(s-> sb.append((char)s));
//        System.out.println(sb);


// charecter kadlena
//        index hai ki ni check kartun ni hai tho builder may daltun
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < sr.length(); i++) {

          char ch =  sr.charAt(i);
         int index  =  sr.indexOf(ch, i+1);
         if(index == -1){
             sb2.append(ch);
         }

        }
        System.out.println(sb2);


        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < sr.length(); i++) {
           char ch = sr.charAt(i);
           int idx = sr.indexOf(ch);
           if(idx == i){
               sb2.append((char) ch);
           }
        }

        System.out.println(sb3);
    }

}
