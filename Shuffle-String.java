class Solution {
    public String restoreString(String s, int[] indices) {
           int n=indices.length;
           char [] ch=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}