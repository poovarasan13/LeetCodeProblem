class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        HashMap<Character,Character> maps=new HashMap<>();
         HashMap<Character,Character> mapt=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char a=s.charAt(i),b=t.charAt(i);
            if(maps.containsKey(a) && maps.get(a)!=b) return false;

            if(mapt.containsKey(b) && mapt.get(b)!=a) return false;
            maps.put(a,b);
            mapt.put(b,a);
        }
        return true;
    }
}