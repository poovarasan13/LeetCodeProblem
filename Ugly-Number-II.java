class Solution {
    public int nthUglyNumber(int n) {
        int[] arr=new int[n];
        int two=2,three=3,five=5;
        int i2=0,i3=0,i5=0;
        arr[0]=1;
        for(int i=1;i<n;i++)
        {
            int temp=Math.min(two,Math.min(three,five));
            arr[i]=temp;
            if(temp==two)
            {
                i2++;
                two= arr[i2]*2;
            }
            if(temp==three)
            {
                i3++;
                three= arr[i3]*3;
            }
            if(temp==five)
            {
                i5++;
                five= arr[i5]*5;
            }

        }
        return arr[n-1];
    }
}