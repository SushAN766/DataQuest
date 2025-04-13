//https://leetcode.com/problems/reverse-string/description/


public class ReverseString {
    public static void main(String[] args) {
        char s[] = {'h', 'e', 'l', 'l', 'o'}; 
        reverseString(s);
        System.out.println(s); 
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
}
