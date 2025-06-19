class Solution {
    public String capitalizeTitle(String title) {
        String [] array=title.split(" ");
        String str="";
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            String s=array[i].toLowerCase();
            if(s.length()>=3){
            char ch=Character.toUpperCase(s.charAt(0));
            str+=(ch+s.substring(1));}
            else{
                str+=s;
            }
            if(i!=n-1)str+=" ";
        }
        return str;
    }
}