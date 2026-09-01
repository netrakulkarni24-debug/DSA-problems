
class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;

        Map<Integer, Integer> sumseen = new HashMap<>();

        // Important: prefix sum 0 occurs once initially
        sumseen.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Check how many times (sum - k) has occurred
            if (sumseen.containsKey(sum - k)) {
                count += sumseen.get(sum - k);
            }

            // Store/frequency of current prefix sum
            sumseen.put(sum, sumseen.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

