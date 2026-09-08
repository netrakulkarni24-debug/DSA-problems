class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
            List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Reset count for a new number, otherwise increment it
            if (i == 0 || nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            // Only keep elements that haven't exceeded limit k
            if (count <= k) {
                result.add(nums[i]);
            }
        }

        // Convert List back to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}