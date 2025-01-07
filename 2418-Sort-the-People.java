class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        TreeMap<Integer,String> tree=new TreeMap<>(map);
        String[] answer=new String[names.length];
        int j=names.length-1;
        for(Map.Entry<Integer,String> en: tree.entrySet())
        {
            answer[j--]=en.getValue();
            // System.out.print(en.getValue());
        }
        return answer;
    }
}