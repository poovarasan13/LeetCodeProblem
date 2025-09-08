class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
            if(m.getValue()==2)
                 ans^=m.getKey();
        }
        return ans;
    }
}