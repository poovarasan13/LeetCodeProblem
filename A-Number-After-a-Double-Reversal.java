class Solution {
    public int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            rev=(rev*10)+(num%10);
            num/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int num1=reverse(num);
        int num2=reverse(num1);
        // System.out.println(num+" "+num2);
        return num==num2;
    }
}