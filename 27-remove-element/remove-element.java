class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int n =nums.length;
        int result[]= new int [n];

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                result[index]=nums[i];
                index++;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }

       return index;
        
    }
}