class Solution {
    public boolean checkIfExist(int[] arr) {
       int n=arr.length;
       List<Integer> list=new ArrayList<>();
       for(int a:arr)
       {
        if(list.contains(a*2) || (a%2==0 && list.contains(a/2))) return true;
        list.add(a);
       } 
       return false;
    }
}