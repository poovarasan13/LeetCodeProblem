class Solution {
    public String sortSentence(String s) {
       TreeMap<Integer,String> map=new TreeMap<>();
       String [] str=s.split(" ");
       for(String a:str)
       {
             int n=a.length();
             int pos=Integer.parseInt(a.substring(n-1));
             String temp=a.substring(0,n-1);
             map.put(pos,temp);
            //  System.out.println(pos+" "+temp);
       } 
       String st="";
       int i=0;
       for(Map.Entry<Integer,String> m:map.entrySet())
       {
       
        if(m.getKey()==1){
            //  System.out.println(m.getKey()+" "+m.getValue());
            st+=m.getValue();
        }
            else 
            {   st+=" ";
                st+=m.getValue();
            }
            i++;
       }

       return st;
    }
}