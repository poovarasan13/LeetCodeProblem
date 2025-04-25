class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n=nums.size();
        int cnt=0;
        long ans=0;
   
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int a:nums)
        {
            if(a%modulo==k)
            cnt=(cnt+1)%modulo;
           int key=(cnt-k+modulo)%modulo;
            ans+=map.getOrDefault(key,0);
            map.put(cnt,map.getOrDefault(cnt,0)+1);
        }
        return ans;
    }
}