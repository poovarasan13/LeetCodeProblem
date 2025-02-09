class Solution {
    public long countBadPairs(int[] nums) {
        long cnt=0;
        int len=nums.length;
        long total,good=0;
        total = ((long) len * (len - 1)) / 2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            int val=nums[i]-i;
            good+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return total-good;
    }
}