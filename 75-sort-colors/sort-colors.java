class Solution {
    public void sortColors(int[] nums) {

     int low=0;
     int high=nums.length-1;
     int i=0;

    while(i<=high){
        if(nums[i]==1){
            i++;
        }
        else if(nums[i]==0){
            int temp=nums[low];
            nums[low]=nums[i];
            nums[i]=temp;
            low++;
            i++;
        }
        else{
            int temp=nums[high];
            nums[high]=nums[i];
            nums[i]=temp;
            high--;
    

        }
    }

       
        
    
}
}