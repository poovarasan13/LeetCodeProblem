class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i+=2)
        {
            for(int j=0;j<nums[i];j++)
            {
               list.add(nums[i+1]);
            }
        } 
        int len=list.size();
        int [] array=new int[len];
        int k=0;
        for(int li:list)
        {
            array[k++]=li;
        }
        return array;
    }
}