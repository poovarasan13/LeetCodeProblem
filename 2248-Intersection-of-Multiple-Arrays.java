class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length,m=nums[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>mm:map.entrySet())
        {
            if(mm.getValue()>=n)
                ans.add(mm.getKey());
        }Collections.sort(ans);
        return ans;
    }
}