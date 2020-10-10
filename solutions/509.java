class Solution {
    public int fib(int N) {
        if (N == 0) return 0;
        else if (N == 1) return 1;
        int F0 = 0, F1 = 1;
        
        int res = 0;
        while (N > 1) {
            res = F0 + F1;
            F0 = F1; 
            F1 = res;
            N--;
        }
        
        return res;
    }
}