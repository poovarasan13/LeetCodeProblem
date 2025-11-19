class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums) l.add(n);
        while(l.contains(original))
        {
            original*=2;
        }
        //   System.out.print(l.contains(original));

        return original;
    }
}