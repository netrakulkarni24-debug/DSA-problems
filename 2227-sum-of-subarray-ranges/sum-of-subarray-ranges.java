class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
         for(int i=0;i<nums.length;i++){
            long largest=nums[i];
            long  smallest= nums[i];
            for(int j=i;j<nums.length;j++){
                    largest= Math.max(nums[j],largest);
                    smallest=Math.min(nums[j],smallest);
                    sum=sum+(largest-smallest);

                }
                

            }
            return sum;

         }
    }
