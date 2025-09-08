class Solution {
    public List<Integer> grayCode(int n) {
        int size=1<<n;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            list.add(i^(i>>1));
        } 
        return list;
    }
}