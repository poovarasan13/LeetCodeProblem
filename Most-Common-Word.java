class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String low=paragraph.toLowerCase();
        String [] s=low.split("[^a-z]+");
        HashMap<String,Integer> map=new HashMap<>();
        for(String a:s)
        {
            boolean flag=true;
            for(String b:banned)
            {
                if(a.equals(b))
                {
                  flag=false;
                  break;
                }
            }
            if(flag)
            {
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        int cnt=0;
        String str="";
         for(String a:map.keySet())
         {
            int data=map.get(a);
            if(cnt<data)
            {
                cnt=data;
                str=a;
            }
            // System.out.println(a+" "+map.get(a));
         }


        return str;
    }
}