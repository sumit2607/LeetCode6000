package LeetCode6000milestone;

import java.util.Scanner;

public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseWord(str));
    }

    private static String reverseWord(String str) {
        String str1 = "";
         for (int i = str.length()-1; i>=0; i--){
            str1 = str1 + str.charAt(i);

         }
         return str1;
    }
}
