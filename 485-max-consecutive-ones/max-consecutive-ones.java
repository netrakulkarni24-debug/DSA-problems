class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

            int l=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
              count++;
              l=  (Math.max(l,count));
            }
            else{
           
            count=0;
            }
        }
        
 
          return l;
       
        

        
    }
}