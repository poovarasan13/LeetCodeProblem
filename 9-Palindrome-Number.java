class Solution {
    public boolean isPalindrome(int x) {
        int a=x ,rev=0,rem=0;
        boolean ans=false;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
         rem=x%10;
         rev=rev*10+rem;
         x=x/10;
        }
        if(a==rev)
        {
         ans=true;
        }
       return ans;
    }
}