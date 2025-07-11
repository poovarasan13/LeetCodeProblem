class Solution {
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length;
        int[] array=new int[len+1];
        array[0]=first;
        for(int i=1;i<len+1;i++)
        {
            array[i]=array[i-1]^encoded[i-1];
        }
        return array;
    }
}