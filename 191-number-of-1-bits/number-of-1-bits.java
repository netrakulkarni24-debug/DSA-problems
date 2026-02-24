class Solution {
    public int hammingWeight(int n) {
        int result=0;

        while(n!=0){
            int last= n&1;
            if(last==1)
            result+=1;
            n=n>>1;
        }
        return result;
    }
}