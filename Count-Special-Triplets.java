class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1000000007;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int data = nums[i];
            map.put(data, map.get(data) - 1);
            int target = data * 2;
            int a = map2.getOrDefault(target, 0);
            int b = map.getOrDefault(target, 0);
            ans = (ans + (1L * a * b) % MOD) % MOD;
            map2.put(data, map2.getOrDefault(data, 0) + 1);
        }

        return (int) ans;
    }
}
