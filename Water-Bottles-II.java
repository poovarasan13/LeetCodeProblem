class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numExchange <= numBottles) {
            ans++;
            numBottles -= numExchange;
            numExchange++;
            numBottles++;
        }

        return ans;
    }
}