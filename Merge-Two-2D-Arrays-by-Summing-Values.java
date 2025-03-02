class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(set.containsKey(nums1[i][0]))
                set.put(nums1[i][0],set.get(nums1[i][0])+nums1[i][1]);
            else
                 set.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set.containsKey(nums2[i][0]))
                set.put(nums2[i][0],set.get(nums2[i][0])+nums2[i][1]);
            else
                 set.put(nums2[i][0],nums2[i][1]);
        }
        int len=set.size();
        int [][] answer=new int[len][2];
        int j=0;
        TreeMap<Integer,Integer>map=new TreeMap<>(set);
         for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
            answer[j][0]=m.getKey();
            answer[j][1]=m.getValue();
            j++;
        }
        // System.out.print(set);
        return answer;
    }
}