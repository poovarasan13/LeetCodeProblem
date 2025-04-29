class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length(), m=num2.length();
        int ans=0;
        if(\0\.equals(num1)|| \0\.equals(num2)) return \0\;
        int[] array=new int[n+m-1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        for(int k=array.length-1;k>0;k--)
        {
            array[k-1]+=array[k]/10;
            array[k]%=10;
        }String str=\\;
        for(int i=0;i<array.length;i++)
        {
            str+=array[i];
            // System.out.print(array[i]);
        }
        return str;
    }
}