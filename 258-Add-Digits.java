class Solution {
    public int addDigits(int num) {
        
       while(num>=10)
       {
        num=add(num);
       }
       
    return num; 
    }
    public static int add(int num)
    {
        
         int rev=0,rem=0;

        while(num>0){
        
        rem=rem+num%10;;
        num=num/10;
        }
       
       return rem;
    }
}