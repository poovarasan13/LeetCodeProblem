class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;
        int vowel=0,constant=0,digit=0;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(Character.isLetter(ch)){
               if("aeiouAEIOU".indexOf(ch)!=-1) vowel++;
               else constant++;
            }
            else if(!Character.isDigit(ch)){
             return false;
            }
        }
        return vowel>=1 && constant>=1;
    }
}