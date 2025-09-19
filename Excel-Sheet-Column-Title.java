class Solution {
    public String convertToTitle(int n) {
        StringBuilder str=new StringBuilder();
        while(n>0)
        {
            n--;
            int temp=n%26;
            str.append((char)('A'+temp));
            // System.out.println((char)('A'+temp));
            n/=26;
        }
        return str.reverse().toString();
        
    }
}