package com.leetcode.easy;

import java.util.Stack;

public class ReverseWords {
    public static String reverseWords(String s) {

        Stack<String> wordStack = new Stack<>();

        String[] words = s.split("(  *)");

        for(String w: words) {
            wordStack.push(w);
        }

        StringBuilder sb = new StringBuilder();

        while (!wordStack.empty()) {
            sb.append(wordStack.pop());
            sb.append(" ");
        }

        return sb.toString().trim();

    }

}
