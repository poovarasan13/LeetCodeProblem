class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=s.toCharArray();
        int n=ch.length;
        int[] freq=new int[26];
        for( char c:ch)
        {
            // map.put(c,map.getOrDefault(c,0)+1);
            freq[c-'a']++;
        }
        int answer=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                if(freq[i]%2==0)
                    answer+=2;
                else 
                    answer+=1;
            }
        }
        return answer;
    }
}