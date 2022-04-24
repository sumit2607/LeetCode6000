package LeetCode6000milestone;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        reverse(x);

    }

    private static int reverse(int x) {
        int ans = 0;
        while (x!=0){
            int digit = x%10;
            if((ans > Integer.MAX_VALUE/10 ) || (ans< Integer.MIN_VALUE/10)){
                return 0;
            }
            ans = (ans *10)+ digit;


            x = x/10;

        }
        return ans;

    }
}
