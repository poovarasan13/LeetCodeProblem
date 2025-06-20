class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int c:candies)
        {
            max=Math.max(max,c);
        }
        for(int i=0;i<candies.length;i++)
        {
            int data=candies[i]+extraCandies;
             if(max<=data)
                 list.add(true);
             else
               list.add(false);
        }
        return list;
    }
}