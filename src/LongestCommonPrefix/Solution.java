package LongestCommonPrefix;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    //TODO
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) return result.toString();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int finalI = i;
            if (Stream.of(strs).anyMatch(s -> s.length() <= finalI || s.charAt(finalI) != c)) {
                break;
            }
            result.append(c);
        }
        return result.toString();
    }
}
