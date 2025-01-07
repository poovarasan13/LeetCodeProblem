class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        int ans=-1;
        for(int n:nums)
        {
            pq.add(n);
        }
        for(int i=0;i<k;i++)
        {
           ans=pq.poll();
        //    System.out.print(ans+" ");
        }
        return ans;
    }
}