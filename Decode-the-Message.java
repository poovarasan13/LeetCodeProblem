class Solution {
    public String decodeMessage(String key, String message) {
    HashMap<Character,Character> map=new HashMap<>();
    int i=97;
    for(char ch:key.toCharArray())
     {
        if(ch!=' ' && !map.containsKey(ch)){
        // System.out.println((char)i+" "+i+" "+ch);
        map.put(ch,(char)i);
        i++;
        }
     }
     String str="";
     for(char ch:message.toCharArray())
     {
        if(ch==' ')
         str+=' ';
         else
      str+=map.get(ch);  
     }
     System.out.print(map);
            return str;
    }
}