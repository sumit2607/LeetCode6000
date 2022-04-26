package LeetCode6000milestone;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println( lengthOfLongestSubstring(s));
    }

    private static boolean lengthOfLongestSubstring(String s) {

        String str = "";

        for (int i =0; i<s.length()-1; i++){

               while (s.charAt(i)!=s.charAt(i+1)){
                   str = str+s.charAt(i);
               }
           }

        System.out.println(str);
        return false;
    }
}
