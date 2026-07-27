class Solution {
    public int percentageLetter(String s, char letter) {
        
        int n = s.length();
        double  a = 0;
        int count =0;
        int b=0;
           for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
           
           }
           a = (count*100)/n;
            b= (int)a;

            return b;



    }
}