package LeetCode6000milestone;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = false;

        if (x < 0) {
            System.out.println(false);
        }

        int number = x;
        // This will store the reverse of the number
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

    }
}
//class Solution {
//    public boolean isPalindrome(int x) {
//          if (x < 0) {
//            return false;
//        }
//        // Store the number in a variable
//        int number = x;
//        // This will store the reverse of the number
//        int reverse = 0;
//        while (number > 0) {
//            reverse = reverse * 10 + number % 10;
//            number /= 10;
//        }
//        return x == reverse;
//    }
//
//}