class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
            // if(map.containsKey(n))
            // {
            //     map.put(n,map.get(n)+1);
            // }
            // else
            // {
            //     map.put(n,1);
            // }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll();
        }
        return result;
    }
}