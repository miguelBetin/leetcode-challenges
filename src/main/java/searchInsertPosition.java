import java.util.Arrays;

public class searchInsertPosition {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));

    }

    public static int searchInsert(int[] nums, int target) {

        if(nums == null || nums.length == 0) return 1;

        int position = 0;
        for(int i=0; i< nums.length; i++) {

            int currItem = nums[i];

            if(currItem==target){
                position = i;
                break;
            } else if (currItem < target) {
                position = i+1;
            }
        }

        return position;
    }
}
