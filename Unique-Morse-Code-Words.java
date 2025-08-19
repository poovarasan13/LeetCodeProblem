class Solution {
    public String changePattern(String[] map,String str)
    {
        String dummy="";
        for(int i=0;i<str.length();i++){
            //    System.out.println((int)str.charAt(i)-97);
               int idx=(int)str.charAt(i)-97;
               dummy+=map[idx];
        }
        return dummy;
    }
    public int uniqueMorseRepresentations(String[] words) {
        String [] map={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int n=words.length;
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            String str=changePattern(map,words[i]);
            set.add(str);
            // System.out.println(str);
        }
        return set.size();
    }
}