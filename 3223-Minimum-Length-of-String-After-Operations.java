class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
        int n=ch.length;
        for( char c:ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int answer=0;
        for(Map.Entry<Character,Integer>m: map.entrySet())
        {
            int val=m.getValue();
            if(val%2==0)
               answer+=2;
            else 
               answer+=1;
        }
        return answer;
    }
}