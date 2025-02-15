class Solution {
    public boolean check(int a,int b)
    {
        if(a<b || b<0) return false;
        if(a==b) return true;
     return (check(a/10,b-(a%10)) || check(a/100,b-(a%100)) || check(a/1000,b-(a%1000)) );   
    }
    public int punishmentNumber(int n) {
        int ans=0;
        
        for(int i=1;i<=n;i++)
        {
            int square=(i*i);
            if(check(square,i))
            {
                ans+=square;
            }
        }
        return ans;
    }
}