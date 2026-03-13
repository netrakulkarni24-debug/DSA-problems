class Solution {
    public boolean check(int[] nums) {
        int gcount=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i-1]>nums[i]){
                       gcount++;
                }

        }

      if( nums[nums.length-1] > nums[0]){
        gcount++;
      }
        
        return gcount<=1;
    }
}