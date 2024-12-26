class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }ArrayList<Integer> list=new ArrayList<>();
                for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])==1)
            {
                list.add(nums[i]);
            }
        }int [] arr=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}