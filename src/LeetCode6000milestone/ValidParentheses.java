package LeetCode6000milestone;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "{{{{}}}{";

        System.out.println(isParenthesesMatchin(str));

    }

    static boolean isParenthesesMatchin(String s){
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(isOpning(curr)){
                stack.push(curr);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else if(!isMatching(stack.peek(), curr)){
                        return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();

    }

    private static boolean isMatching(Character peek, char curr) {
        return (peek=='(' && curr==')') || (peek=='[' && curr==']') || (peek=='{' && curr=='}');
    }

    private static boolean isOpning(char c) {
        return (c == '(' || c=='[' || c=='{');

    }

}
