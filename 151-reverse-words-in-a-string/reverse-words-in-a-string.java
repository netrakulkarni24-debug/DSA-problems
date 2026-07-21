class Solution {
    public String reverseWords(String s) {

      String[] str = s.trim().split("\\s+");
        int n = str.length;
      
        for(int i=0;i<n/2;i++){
            
          
                String temp = str[i];
                str[i]= str[n-1-i];
                str[n-1-i]=temp;
       
               
        }
       
        String t = String.join(" ",str);
       
        return t;
       
    }
}