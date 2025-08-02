class Solution {
    public int numWaterBottles(int numBottle, int numExchange) {
          int cnt=numBottle;

          while(numBottle>=numExchange)
          {
            cnt+=numBottle/numExchange;
            numBottle=(numBottle/numExchange)+(numBottle%numExchange);
          }
          return cnt;
    }
}