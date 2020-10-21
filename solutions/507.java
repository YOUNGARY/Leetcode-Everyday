class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0, divisor = 1, max = num;
        while (divisor < max) {
            if (num % divisor == 0) {
                max = num / divisor;
                if (max == num) {
                    sum += divisor;
                } else {
                    sum += (divisor + max);
                }
            }
            divisor++;
        }
        return sum == num;
    }
}