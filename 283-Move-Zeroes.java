class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length, j = 0, i;
        int[] array = new int[l];
        for (i = 0; i < l; i++) {
            if (nums[i] != 0)
                array[j++] = nums[i];
        }

        int p = 0;
        for (int a : array) {
            nums[p++] = a;
        }

    }
}