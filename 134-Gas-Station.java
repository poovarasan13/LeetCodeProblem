class Solution {
    public int sum(int[] arr) {
        int sum = 0;
        for (int a : arr)
            sum += a;
        return sum;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        if (sum(gas) < sum(cost))
            return -1;
        int curr = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            curr += gas[i] - cost[i];
            if (curr < 0) {
                curr = 0;
                idx = i + 1;
            }
        }
        return idx;
    }
}