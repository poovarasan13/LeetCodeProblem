class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int max=0;
        int onecount=0,zerocount=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) zerocount++;
            else onecount++;
            int diff=zerocount-onecount;
            if(map.containsKey(diff))
            {
                max=Math.max(max,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }

        }
                    return max;
    }
}