class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int ans=0;
        ans=(28*w) + 7*(w-1)*w/2;
        ans+= d * (d+1)/2+ (d*w);
        return ans;
    }
}