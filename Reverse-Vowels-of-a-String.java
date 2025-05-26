class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int i=0,j=s.length()-1;
        String vowels=\aeiouAEIOU\;
        while(i<j)
        {
            while(i<j && vowels.indexOf(c[i])==-1) i++;
            while(i<j && vowels.indexOf(c[j])==-1) j--;
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}