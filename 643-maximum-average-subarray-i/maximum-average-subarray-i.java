class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l =0;
        int avg = 0;
    
        int maxi = Integer.MIN_VALUE;
        int cs = 0;
        for(int r=0; r<nums.length; r++)
        { 
            cs+=nums[r];
          
            if(r-l+1==k){
                maxi = Math.max(cs,maxi);
                 cs-=nums[l];
                 l=l+1;

            }
        }

          
        return (double)maxi/k;
    }
}