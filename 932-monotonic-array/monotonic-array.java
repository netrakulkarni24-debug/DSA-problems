class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncreasing = false; // Cannot be monotone increasing
            }
            if (nums[i] < nums[i + 1]) {
                isDecreasing = false; // Cannot be monotone decreasing
            }
        }

        // Must be at least one of them
        return isIncreasing || isDecreasing;
            
    }
}