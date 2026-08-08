class Solution {
    public int characterReplacement(String s, int k) {

        int maxfreq=0;
        
        int[]  hash = new int [26];
            int left = 0;
            int maxwindow=0;
            for(int right = 0;right<s.length();right++){
                  hash[s.charAt(right)-'A']++;
                  maxfreq=Math.max(maxfreq,hash[s.charAt(right)-'A']);
                  int windowlength= right-left+1;
                  if(windowlength-maxfreq>k){
                      hash[s.charAt(left)-'A']--;
                      left++;
                  }

                  windowlength = right-left+1;
                  maxwindow=Math.max(windowlength,maxwindow);
            }

              return maxwindow ;
    }
}