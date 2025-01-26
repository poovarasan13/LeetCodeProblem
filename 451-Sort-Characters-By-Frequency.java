class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int len=s.length();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
         List<Character> list=new ArrayList<>(map.keySet());
         Collections.sort(list,(a,b) -> map.get(b)-map.get(a));
         StringBuilder str=new StringBuilder();
         for(char c:list)
         {
            str.append(String.valueOf(c).repeat(map.get(c)));
         }
         return str.toString();
    }
}