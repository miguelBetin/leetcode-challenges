package com.leetcode.easy;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        if(x<0) return false;
        if(x==0) return true;
        return reverseNumber(x) == x;
    }

    public static int reverseNumber(int number) {

        StringBuilder sb = new StringBuilder("");

        int digit;
        while(number > 0) {

            digit = number % 10;

            sb.append(digit);

            number = number / 10;

        }

        int ans = 0;
        try {
            ans = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {

        }

        return ans;
    }


}
