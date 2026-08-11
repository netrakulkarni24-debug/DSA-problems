class Solution {
    public int removeDuplicates(int[] nums) {
        int index =0;
          HashSet <Integer> set = new LinkedHashSet<>();
          for(int a:nums){
            set.add(a);
          }
             for (int c : set){
                nums[index]= c;
                index++;
             }
       return index;
       
    }
}