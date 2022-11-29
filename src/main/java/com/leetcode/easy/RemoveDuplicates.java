package com.leetcode.easy;

import java.util.ArrayList;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> set = new ArrayList<>();

        for (int i= 0; i<nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }

        int i=0;
        for(int s:set) {
            nums[i++] = s;
        }
        return set.size();

    }

}
