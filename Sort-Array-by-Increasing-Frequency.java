class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
       
        int len=nums.length;
        for(int n:nums){
          map.put(n,map.getOrDefault(n,0)+1);
        }
           List<Integer> list=new ArrayList<>(map.keySet());
        //    for(Map.Entry<Integer,Integer> m:map.entrySet())
        //    {
        //     System.out.println(m.getKey()+" "+m.getValue());
        //    }
        list.sort((a, b) -> {
            return map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b);
        });
        int k=0;
        for(int i:list)
        {
            for(int j=0;j<map.get(i);j++)
            {
                nums[k++]=i;
                // System.out.print(i+" ");
            }
        }
        return nums;
    }
}