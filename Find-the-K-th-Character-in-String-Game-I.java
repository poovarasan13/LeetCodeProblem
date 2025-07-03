class Solution {
    public char kthCharacter(int k) {
        StringBuilder str=new StringBuilder("a");
        while(str.length()<k)
        {
            int n=str.length();
            for(int i=0;i<n;i++)
            {
                str.append((char)('a'+((str.charAt(i)-'a')+1)%26));
            }
        }
        // System.out.print(str);
        return str.charAt(k-1);
    }
}