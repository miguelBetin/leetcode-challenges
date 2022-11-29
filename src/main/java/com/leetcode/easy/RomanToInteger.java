package com.leetcode.easy;

public class RomanToInteger {
    public static int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);
        int value = 0;
        int amountToDecrease = 0;

        if(s.length() > 1) {

            int i=1;

            value = value + getCharacterValue(s.substring(0,1));

            while(i<s.length()) {

                String prevChar = sb.substring(i-1, i);
                int prevCharValue = getCharacterValue(prevChar);

                String currentChar = sb.substring(i,i+1);
                int currentCharValue = getCharacterValue(currentChar);

                if(prevCharValue < currentCharValue) {
                    amountToDecrease = amountToDecrease + (prevCharValue*2);
                }

                value = value + currentCharValue;

                i++;

            }
        } else {
            value = getCharacterValue(s);

        }


        return value-amountToDecrease;
    }

    public static int getCharacterValue(String s) {


        switch (s) {
            case "I" : return  1;
            case "V" : return  5;
            case "X" : return  10;
            case "L" : return  50;
            case "C" : return  100;
            case "D" : return  500;
            case "M" : return  1000;

            default: return 0;
        }

    }


}
