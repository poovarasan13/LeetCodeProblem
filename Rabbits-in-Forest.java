class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=answers.length;
        for(int i=0;i<n;i++)
        {
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
           int group=m.getKey()+1;
                cnt+=(int)(Math.ceil((double)m.getValue()/group))*group;
            
        }
        return cnt;
    }
}