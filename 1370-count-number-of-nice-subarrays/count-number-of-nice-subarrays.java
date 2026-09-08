class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
          return atMost(nums, k) - atMost(nums, k - 1);

    }

          private int atMost(int[] nums, int p) {
        // No valid subarray for negative sum
        if (p< 0) return 0;

        int left = 0;
        int sum = 0;
        int count = 0;

        // Traverse array using right pointer
        for (int right = 0; right < nums.length; right++) {
            // Add current element to sum
            sum += (nums[right])%2;

            // Shrink window if sum exceeds k
            while (sum > p) {
                sum -= (nums[left])%2;
                left++;
            }

            // Add number of valid subarrays ending at right
            count += (right - left + 1);
        }

        return count;
    }
           
    }
