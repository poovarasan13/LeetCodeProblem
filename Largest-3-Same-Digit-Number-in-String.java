class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        int n=num.length();
        for(int i=0;i<=n-3;i++)
        {
            char first=num.charAt(i),second=num.charAt(i+1),third=num.charAt(i+2);
            if(first==second && first==third)
            {
                if(str.isEmpty()|| first>str.charAt(0))
                       str=""+first+first+first;
            }
        }
        return str;
    }
}