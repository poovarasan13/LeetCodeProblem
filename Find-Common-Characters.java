class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        int[][] map=new int[n][26];
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                int data=words[i].charAt(j)-'a';
                map[i][data]++;
            }
        }
        for(int i=0;i<26;i++)
        {
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=0;j<n;j++)
            {
                index=j;
                min=Integer.min(min,map[j][i]);
                // System.out.print((map[j][i])+" ");
            }
            // System.out.println((char)(i+97));

            for(int k=0;k<min;k++)
              list.add(Character.toString((char)(i+97)));
            
        }
        return list;
    }
}