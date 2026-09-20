class Solution {
    public int[] leftRightDifference(int[] nums) {
                      int leftsum=0;
                        int rightsum=0;
                 int[] ans =new int [nums.length];
                   ans[0]=leftsum;
                int[] ans1 = new int [nums.length];
                     ans1[nums.length-1]=rightsum;

                     int[] finall = new int [nums.length];

                for(int i=1;i<nums.length;i++){
                    
                   ans[i]= ans[i-1]+nums[i-1];
                }

                  for(int i=nums.length-2;i>=0;i--){
                    
                   ans1[i]=ans1[i+1]+nums[i+1];
                }

                  for(int i=0;i<ans.length;i++){
                       finall[i]=Math.abs(ans[i]-ans1[i]);
                  }

                return finall;
        }
    }