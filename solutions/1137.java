class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int Tn = 0, Tn1 = 1, Tn2 = 1, Tx = 0;
        for (int i = 3; i <= n; i++) {
            Tx = Tn + Tn1 + Tn2;
            Tn = Tn1;
            Tn1 = Tn2;
            Tn2 = Tx;
        }
        return Tn2;
    }
}