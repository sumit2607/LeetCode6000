package LeetCode6000milestone;

import java.util.Scanner;

public class MaximumandminimumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean res = false;
        int minimum = 0;
        int maximum = 0;

        for (int i = 0; i<arr.length; i++){
            int min = arr[0];
            int max = arr[0];
            if(min<arr[i]){
                 arr[i] = minimum;
               res = true;

            }
            if (min>arr[i]){
                 arr[i] = maximum;
                res = true;
            }
        }
        if(res){
            System.out.println(minimum);
        }
        if(res){
            System.out.println(maximum);
        }
    }
}
//Maximum and minimum of an array using minimum number of comparisons
//int arr[] = {1000, 11, 445, 1, 330, 3000};
//Minimum element is 1
//Maximum element is 3000