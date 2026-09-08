class Solution {
    public int findLucky(int[] arr) {
        
        int maxi=-1;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        for(int a :map. keySet()){
                  if(a==map.get(a)){
                     maxi = Math.max(maxi,a);
                  }
        }
        return maxi ;
        
    }
}