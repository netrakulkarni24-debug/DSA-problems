class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int arr:nums){
            ans=ans^arr;
        }
        return ans;
    }
}