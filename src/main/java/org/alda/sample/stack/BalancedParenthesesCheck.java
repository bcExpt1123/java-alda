package org.alda.sample.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bcExpt1123
 *
 * Balanced Parentheses Check using Stack
 */
public class BalancedParenthesesCheck {
    public static void main(String[] args) {
        String test = "{([])}";
        System.out.println(isValid(test));

        String test2 = "{([)]}";
        System.out.println(isValid(test2));

        String test3 = "{([{}{}{}[][][]()()()[{}{}]])}";
        System.out.println(isValid(test3));
    }

    public static Boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        Map<Character, Character> mapping = mapping();

        for (Character c : s.toCharArray()) {
            if(mapping.containsKey(c)){
                Character topElement = stack.isEmpty() ? '#' : stack.removeLast();
                if(mapping.get(c) != topElement){
                    return false;
                }
            } else {
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }

    public static Map<Character, Character> mapping(){
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        return mapping;
    }
}
