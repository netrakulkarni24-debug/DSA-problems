class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

            int l=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
              count++;
            }
            else{
            l=  (Math.max(l,count));
            count=0;
            }
        }
        
 
          return (Math.max(l,count));
       
        

        
    }
}