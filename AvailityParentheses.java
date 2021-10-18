import java.util.ArrayList;
import java.util.List;

public class AvailityParentheses {


    public static void main(String[] args) {
        String parentheses1 = "{()[]}";
        String parentheses2 = "({2})";
        String parentheses3 = "()[]((";
        String parentheses4 = "(((){";

        List<Character> chr = new ArrayList<>();

        boolean isNotValid = false;

        for(int i = 0; i < parentheses2.length(); i++) {
            if(parentheses2.charAt(i) == '(' || parentheses2.charAt(i) == '{' || parentheses2.charAt(i) == '['
                    || parentheses2.charAt(i) == ')' || parentheses2.charAt(i) == '}' || parentheses2.charAt(i) == ']') {
                chr.add(parentheses2.charAt(i));
            }
        }
        if(chr.size() % 2 != 0) {
            System.out.println(isNotValid);
        }
        else {
            List<Character> chrNew = new ArrayList<>();
            for (int i = 0; i < chr.size(); i++) {
                for (int j = i + 1; j < chr.size(); j++) {
                    if (chr.get(i) == '(' && chr.get(j) == ')' || chr.get(i) == '{' && chr.get(j) == '}'
                            || chr.get(i) == '[' && chr.get(j) == ']') {
                        chrNew.add(chr.get(i));
                        chrNew.add(chr.get(j));
                        break;
                    }
                }
            }
            if(chr.size() == chrNew.size()){
                boolean isValid = true;
                System.out.println(isValid);
            }
            else{
                System.out.println(isNotValid);
            }
        }
    }
}