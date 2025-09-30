class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        HashMap<Integer,ArrayList<Integer>> list=new HashMap<>();
        int idx=0;
        if(n==1) return nums[0];
        List<Integer> l=new ArrayList<>();
        for(int a:nums)
           l.add(a);
        for(int i=0;i<n-1;i++)
        {
            list.put(idx,new ArrayList<>());
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<l.size()-1;j++)
            {
               temp.add((l.get(j)+l.get(j+1))%10);
            }
            list.put(idx,temp);
            l.removeAll(l);
            l=temp;
            idx++;
        
        }
        // System.out.println((list.get(idx-1).get(0))%10);
        return (list.get(idx-1).get(0))%10;
    }
}