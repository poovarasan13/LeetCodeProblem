class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        if(len==1 && k==1) return 1;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0,sum=0;
        for(int i=0;i<len;i++)
        {
             sum=sum+nums[i];
            int val=sum-k;
            if(map.containsKey(val))
              cnt+=map.get(val);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}