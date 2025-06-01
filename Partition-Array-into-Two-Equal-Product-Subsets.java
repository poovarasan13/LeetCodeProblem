class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;
        int totalSubsets = 1 << n; 

        for (int mask = 1; mask < totalSubsets - 1; mask++) {
            long product1 = 1;
            long product2 = 1;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    product1 *= nums[i];
                    if (product1 > target) break; 
                }
            }

            if (product1 != target) continue;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) {
                    product2 *= nums[i];
                    if (product2 > target) break; 
                }
            }

            if (product2 == target) return true;
        }

        return false;
    }
}
