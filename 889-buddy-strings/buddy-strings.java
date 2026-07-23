class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int count =0;
         int i=-1;
         int j=-1;
       
           if (s.equals(goal)) {
            HashSet<Character> set = new HashSet<>();

            for (char ch : s.toCharArray()) {
                if (!set.add(ch)) {
                    return true;
                }
            }
            return false;
        }
             
             for(int k=0;k<s.length();k++){
                if(s.charAt(k)!=goal.charAt(k)){
                    count++;
                    if(i==-1){
                        i=k;
                    }
                    else if(j==-1){
                        j=k;
                    }
                }
             }
             if(count ==2 && s.charAt(i)== goal.charAt(j) && s.charAt(j)==goal.charAt(i)){
                return true;
             }
             return false ;

    }
}