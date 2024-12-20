class Solution {
    public int reverse(int x) {
       
        long rem=0,rev=0;
          
          int flag=0;
    if(x<0) {
        x=x*(-1);
        flag=1;
    }     while(x>0){
        
            rem=x%10;
            rev=rev*10 +rem;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE) return 0;
        if(flag==1) return (int)-rev;
         
         return (int)rev;
       
    }
}