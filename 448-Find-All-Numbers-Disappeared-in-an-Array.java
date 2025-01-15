class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int [] arr=new int[n+1];
        for(int a:nums)
        {
            arr[a]=a;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==0)
              list.add(i);
        }
        return list;
    }
}