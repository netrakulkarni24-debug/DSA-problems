class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int [2];
        int j=0;
        Map<Integer,Integer> map= new HashMap<>();
            for(int a : nums){
                map.put(a,map.getOrDefault(a,0)+1);
            }

            for(int key : map.keySet()){
               
                 if( map.get(key)==2){
                   ans[0]=key;
                   break;

                }
                
            }

         for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                ans[1]=i;
                break;
            }
         }
             
            return ans ;
            
        }
    }
