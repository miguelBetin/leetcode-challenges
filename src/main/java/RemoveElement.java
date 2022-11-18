
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int newSize = nums.length;

        for (int i = 0; i<nums.length; i++) {
            int current = nums[i];

            if(current==val) {
                newSize--;
            }
        }

        for (int i = 0; i<nums.length - 1; i++) {

            while(nums[i]==val && i<newSize){

                moveToLastPosition(nums, i);
                if(nums[i]!=val) {
                    i++;
                }
            }
        }

        return newSize;
    }

    public static void moveToLastPosition(int[] nums, int startingPos) {

        for(int j = startingPos + 1; j<nums.length ; j++) {
            int current = nums [j-1];
            int next = nums[j];

            if(current!=next) {
                nums[j-1] = nums[j];
                nums[j] = current;
            }
        }
    }

}
