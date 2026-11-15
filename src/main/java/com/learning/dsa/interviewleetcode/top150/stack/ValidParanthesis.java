package com.learning.dsa.interviewleetcode.top150.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        ValidParanthesis paranthesis = new ValidParanthesis();
        System.out.println(paranthesis.isValid("([)]"));
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        if (s.length() % 2 != 0) return false;

        Stack<Character> characters = new Stack<>();
        char[] input = s.toCharArray();
        //({[]})
        for (Character c : input) {
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (characters.isEmpty() || !hasValidOpen(c, characters.pop())) {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }

    private boolean hasValidOpen(Character closeChar, Character openChar) {
        return (closeChar == ')' && openChar == '(') || (closeChar == '}' && openChar == '{') || (closeChar == ']' && openChar == '[');
    }
}
