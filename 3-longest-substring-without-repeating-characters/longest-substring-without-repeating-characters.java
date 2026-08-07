class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int maxsum=0;
        int leftsum = 0;
        for(int rightsum =0; rightsum<s.length(); rightsum++){
            char ch = s.charAt(rightsum);
            while(hash.contains(ch)){
                hash.remove(s.charAt(leftsum));
                leftsum++;
            }
            hash.add(ch);
            maxsum= Math.max(maxsum,rightsum - leftsum+1);
        }
        
        return maxsum;
    }
}