class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int a:nums)
        {
            set.add(a);
        }
        int cnt=0;
        int unique=set.size();
        int i=0,j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n)
        {
           map.put(nums[j],map.getOrDefault(nums[j],0)+1);
           while(map.size()==unique)
           {
            cnt+=(n-j);
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0)
             map.remove(nums[i]);
             i++;
           }
           j++;
        }
        return cnt;
    }
}