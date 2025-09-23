class Solution {
    public int compareVersion(String version1, String version2) {
       String [] str1=version1.split("\\.");
       String [] str2=version2.split("\\.");
       int n=Math.max(str1.length,str2.length);
    //    System.out.println(n);
       for(int i=0;i<n;i++)
       {
        int n1=i<str1.length? Integer.parseInt(str1[i]):0;
        int n2=i<str2.length? Integer.parseInt(str2[i]):0;
        // System.out.println(n1+" "+n2);
        if(n1<n2) return -1;
        if(n1>n2) return 1;
       }
       return 0;

    }
}