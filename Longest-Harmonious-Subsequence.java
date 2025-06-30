class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        int length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet())
        {
            if(map.containsKey(a+1))
            {
                int l=map.get(a)+map.get(a+1);
                length=Math.max(length,l);
            }
        }
        return length;

    }
}