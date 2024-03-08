package Backspace_String_Compare_844.Java_Solve;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static boolean backspaceCompare(String s, String t) {
        String s1 = s.replace('\043', '\010');
        String t1 = t.replace('\043', '\010');
        return s1.equals(t1);
    }
}
