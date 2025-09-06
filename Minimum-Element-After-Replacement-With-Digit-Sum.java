class Solution {
    public int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;

    }
    public int minElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            // System.out.println(nums[i]);
            nums[i]=sum(nums[i]);
        }
        int min=Integer.MAX_VALUE;
        for(int a:nums)
        {
            // System.out.println(a);
            if(a<min) min=a; 
        }
        return min;
    }
}