class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l =0;
        int avg = 0;
        int len = 0;
        int maxi = Integer.MIN_VALUE;
        int cs = 0;
        for(int r=0; r<nums.length; r++)
        {
            cs += nums[r];
            len++;
            if(k == len)
            {
                maxi = Math.max(cs, maxi);
                cs -= nums[l++];
                len--;
            }
        }
        return (double)maxi/k;
    }
}