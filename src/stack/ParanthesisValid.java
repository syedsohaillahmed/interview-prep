package stack;

import java.util.Stack;

public class ParanthesisValid {
    static void main() {
        Stack<Character> s = new Stack();
        String para = "[]{}({})";
        char[] c = para.toCharArray();
        for (char cs: c){
            if(cs == '('){
                s.push(')');
            }else if(cs == '{'){
                s.push('}');
            } else if (cs == '[') {
                s.push(']');
            } else if (s.isEmpty() || s.pop() != cs) {
                System.out.println("invalid");
                break;
            }
        }

        if(s.isEmpty()) {
            System.out.println("valid");
        }

    }
}
