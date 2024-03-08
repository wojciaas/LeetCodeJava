package Backspace_String_Compare_844.Java_Solve;

public class Main {
    public static void main(String[] args) {
        String s1 = "ab#c", t1 = "ad#c";
        String s2 = "ab##", t2 = "c#d#";
        String s3 = "a#c", t3 = "b";
        System.out.println("\043\010");
        System.out.println(Solution.backspaceCompare(s1, t1));
        System.out.println(Solution.backspaceCompare(s2, t2));
        System.out.println(Solution.backspaceCompare(s3, t3));
    }
}
