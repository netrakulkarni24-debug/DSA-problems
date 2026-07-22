class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        String a[] = s.trim().split("\\s+");
          String t = a[a.length-1];
          for(int i=0;i<t.length();i++){
                    count++;
          }
          return count ;
    }
}