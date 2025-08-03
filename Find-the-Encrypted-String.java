class Solution {
    public String getEncryptedString(String s, int k) {
        String str="";
        int n=s.length();
        k=k%n;
        for(int i=k;i<n;i++) str+=s.charAt(i);
        for(int i=0;i<k;i++) str+=s.charAt(i);
        return str;
    }
}