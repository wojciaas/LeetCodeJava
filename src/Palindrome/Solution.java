package Palindrome;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int result = 0, i = x;
        while (i != 0) {
            result = result * 10 + i % 10;
            i /= 10;
        }
        return x == result;
    }
}
