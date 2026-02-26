class Solution {
    public int[] countBits(int n) {
           
        int result[]= new int [n+1];
       
        for(int i=0;i<=n;i++){
            int num=i;
            while(num!=0){
                int last=num&1;
                if(last==1)
                  result[i]+=1;
                num=num>>1;
            }
        }

        return result;
        
    }
}