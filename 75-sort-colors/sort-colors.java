class Solution {
    public void sortColors(int[] nums) {

        int result[]= new int[100];
        int index=0;
        int zeros=0;
        int ones= 0;
        int twos= 0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zeros++;
        }
        else if(nums[i]==1){
            ones++;
        }
        else{
            twos++;
        }

        }


        while(zeros>0){
            nums[index]=0;
            index++;
            zeros--;
        }

         while(ones>0){
            nums[index]=1;
            index++;
            ones--;
        }

         while(twos>0){
            nums[index]=2;
            index++;
            twos--;
        }

       
        
    
}
}