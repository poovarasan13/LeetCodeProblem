class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int maxSum=0,i=0,j=0,sum=0;
        Set<Integer> set=new HashSet<>();
        while(i<n)
        {   
             if(!set.contains(nums[i]))
             {
                set.add(nums[i]);
                sum+=nums[i++];
                maxSum=Math.max(sum,maxSum);       
             }
             else{
                set.remove(nums[j]);
                sum-=nums[j++];

             }
        }
        return maxSum;
    }
}