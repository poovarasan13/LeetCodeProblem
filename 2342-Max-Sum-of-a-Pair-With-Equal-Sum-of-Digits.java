class Solution {
    public int unit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            int val=unit(nums[i]);
        if(map.containsKey(val))
        {
            max=Math.max(max,map.get(val)+nums[i]);
            map.put(val,Math.max(map.get(val),nums[i]));
        }
        else{
            map.put(val,nums[i]);
        }
        }
        // for(Map.Entry<Integer,Integer> m: map.entrySet())
        // {
        //     // System.out.println(m.getKey()+" ->"+m.getValue());
        //     if(max<m.getValue())
        //          max=m.getValue();
        // }
        return max;
    }
}