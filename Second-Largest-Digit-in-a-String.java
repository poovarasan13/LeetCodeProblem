class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set=new TreeSet<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                set.add(c-'0');
            }
        }
       if (set.size() < 2) {
            return -1;
        }
        set.pollLast();

        return set.last();
    }
}