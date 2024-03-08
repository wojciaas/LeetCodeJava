package ValidParentheses;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    private static final Map<Character, Character> PARANTHESES = new HashMap<>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
    }};

    //TODO
    public static boolean isValid(String s) {
        for (int i = 1; i < s.length(); i += 2) {
            if(s.charAt(i) != PARANTHESES.get(s.charAt(i - 1)))
                return false;
        }
        return true;
    }
}
