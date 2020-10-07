class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles, empty = numBottles;
        while (empty >= numExchange) {
            int exchange = empty / numExchange;
            ans += exchange;
            empty = empty - exchange * numExchange + exchange;
        }
        return ans;
    }
}