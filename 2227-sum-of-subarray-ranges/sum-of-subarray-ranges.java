import java.util.Stack;
class Solution {
    public long subArrayRanges(int[] nums) {
        Stack <Integer> st = new Stack<>();
      
       long sum2=0;
        int n = nums.length;
        int [] nge= new int [n];
        int [] pge= new int [n];
        int [] pse= new int[n];
        int[] nse= new int[n];
       for(int i=nums.length-1;i>=0;i--){
        while(!st.isEmpty() && nums[st.peek()]<nums[i]){
            st.pop();
        } 

        if(st.isEmpty()){
            nge[i]=n;
        }
        else{
            nge[i]=st.peek();
        }
       
       st.push(i);

       }

       st.clear();

      for(int i=0;i<nums.length;i++){
        while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
               st.pop();
        }
        if(st.isEmpty()){
            pge[i]=-1;
        }
        else{
            pge[i]=st.peek();
        }
        st.push(i);
      }

      st.clear();

      for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        
        // Previous Smaller Element (PSE) - use >= to handle duplicates correctly
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
          
          for(int i=0;i<n;i++){
            long left= i-pge[i];
             long right = nge[i]-i;
              long  sum=(left*right*(long)nums[i]);
                
                long left1= i- pse[i];
                long right1= nse[i]-i;
                long sum1= (left1*right1*(long)nums[i]);
              sum2=sum2+(sum-sum1);

          }
          return sum2;
          
         }
}
