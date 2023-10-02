package stack;

import java.util.Scanner;

class Stack {
    char[] stack;
    int top;

    public Stack(int size) {
        stack = new char[size];
        this.top = -1;
    }

    public void push(char data) {
        stack[++top] = data;
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }
}

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        Stack stack = new Stack(brackets.length());

        int count = 0;
        for (count = 0; count < brackets.length(); count++) {
            char ch = brackets.charAt(count);
            boolean result = false;

            switch (ch) {
            case '(': case '{': case '[':
                stack.push(ch);
                break;

            case ')':
                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
                    result = true;
                }
                break;

            case '}':
                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
                    result = true;
                }
                break;

            case ']':
                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
                    result = true;
                }
                break;
            }
            
            if(result) {
                break;
            }
        }
        
        if(stack.isEmpty() && count == brackets.length()) {
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }
        
       sc.close();
    }
}
