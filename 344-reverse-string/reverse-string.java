class Solution {
    
    public void reverseString(char[] s) {
        int n = s.length;
        int left=0;
        int right= s.length-1;
      for(int i=0;i<n/2;i++){
          char temp = s[i];
          s [i]= s [n-i-1];
          s[n-i-1]= temp;
      }
      
    }
}