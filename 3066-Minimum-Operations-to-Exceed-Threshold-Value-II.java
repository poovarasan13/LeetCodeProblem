class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int n:nums)
        {
            if(n<k) pq.add((long)n);
        }
        int cnt=0;
        while(!pq.isEmpty())
        {
            long a=pq.poll();
            cnt++;
            if(pq.isEmpty())
               break;
               long b=pq.poll();
               long val=(Math.min(a,b)*2 +Math.max(a,b));
               if(val<k)
               pq.add(val);
        }
        // System.out.println(pq);
        return cnt;
    }
}