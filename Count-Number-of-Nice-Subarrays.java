class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int prefixSum=0;
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int a:nums)
        {
            prefixSum+=(a%2==0)?0:1;
            cnt+=map.getOrDefault(prefixSum-k,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);     
        }
        return cnt;
    }
}