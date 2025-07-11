class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (set.contains(s.charAt(i)))
                    return true;
                else
                    set.add(s.charAt(i));
            }
            return false;
        }
        int[] diff = new int[2];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)!=goal.charAt(i))
                {
                    if(index==2) return false;
                    diff[index++]=i;
                }
        }
        if(index!=2)  return false;
        return s.charAt(diff[0])==goal.charAt(diff[1]) && s.charAt(diff[1])==goal.charAt(diff[0]);
    }

}