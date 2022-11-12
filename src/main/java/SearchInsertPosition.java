public class SearchInsertPosition {

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
