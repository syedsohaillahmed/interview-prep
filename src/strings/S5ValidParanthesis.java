package strings;

public class S5ValidParanthesis {
    static void main() {
        String s1 = "{()}";

        while (s1.contains("{}") || s1.contains("[]") || s1.contains("()") ){
            s1= s1.replace("{}", "")
                    .replace("[]", "")
                    .replace("()", "");

            System.out.println("yo");
        }
        System.out.println(s1.length());
    }
}
