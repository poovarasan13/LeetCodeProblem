class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subSet=new ArrayList<>();
        createSubSet(nums,0,list,subSet);
        return list;
    }
    private static void createSubSet(int[] nums,int index,List<List<Integer>> list,List<Integer> subSet)
    {
        if(index==nums.length)
        {
            list.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[index]);
        createSubSet(nums,index+1,list,subSet);

        subSet.remove(subSet.size()-1);
        createSubSet(nums,index+1,list,subSet);
    }
}