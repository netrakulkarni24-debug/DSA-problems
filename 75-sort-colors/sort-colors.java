class Solution {
    public void sortColors(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        // Count 0s, 1s, 2s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } 
            else if (nums[i] == 1) {
                ones++;
            } 
            else {
                twos++;
            }
        }

        int index = 0;

        // Place 0s
        for (int i = 0; i < zeros; i++) {
            nums[index] = 0;
            index++;
        }

        // Place 1s
        for (int i = 0; i < ones; i++) {
            nums[index] = 1;
            index++;
        }

        // Place 2s
        for (int i = 0; i < twos; i++) {
            nums[index] = 2;
            index++;
        }
    }
}