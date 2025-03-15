class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int i,j,max=0,n=arr.length;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int a:arr)
        {
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        // System.out.print(freq);
        for(Map.Entry<Integer,Integer>m:freq.entrySet())
        {
               if(set.contains(m.getValue()))
                    return false;
            set.add(m.getValue());
        }
        return true;
        
    }
}