package RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
    private static final Map<Character, Integer> ROMANIAN_NUMS = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = ROMANIAN_NUMS.get(s.charAt(i));
            int next = i + 1 < s.length() ? ROMANIAN_NUMS.get(s.charAt(i + 1)) : 0;
            if (current < next) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }
        return result;
    }
}
