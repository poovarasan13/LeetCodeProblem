class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        int n=allowed.length();
        for(int i=0;i<n;i++)
        {
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String str:words)
        {
         int cnt=1,len=str.length();
         for(int i=0;i<len;i++)
         {
            if(!set.contains(str.charAt(i)))
            {
                cnt=0;
                break;
            }
         }
         count+=cnt;
        }
        return count;
    }
}