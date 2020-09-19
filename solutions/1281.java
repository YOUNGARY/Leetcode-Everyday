class Solution {
    public int subtractProductAndSum(int n) {
        int cur = 0, sum = 0, product = 1;
        while (n != 0) {
            cur = n % 10;
            sum += cur;
            product *= cur;
            n /= 10;
        }
        return  product - sum;
    }
}