class Solution {
    public boolean checkPowersOfThree(int n) {
        int[] pow=new int[16];
        for(int i=0;i<=15;i++)
        {
            pow[i]=(int)Math.pow(3,i);
        }
        for(int i=15;i>=0;i--)
        {
            if(n>=pow[i]){
               n=n-pow[i];
            //    System.out.println(n);
            }
            
            if(n==0) return true;
        }
        return false;
    }
}