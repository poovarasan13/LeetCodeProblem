class Solution {
    static int MOD=1000000007;
    public int numTilings(int n) {
        
        if(n<=2) return n;
        if(n==3) return 5;
        long x1=1,x2=2,x3=5;
        for(int i=4;i<=n;i++)
        {
            long curr=(2*x3 % MOD +x1)%MOD;
            x1=x2;
            x2=x3;
            x3=curr;
        }
        return (int)x3;
    }
}