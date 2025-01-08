class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            int val=k-a;
            if(map.getOrDefault(val,0) > 0)
            {
                cnt++;
                map.put(val,map.get(val)-1);
               
            }
            else{
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        return cnt;
    }
}