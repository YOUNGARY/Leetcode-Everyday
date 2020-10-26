class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        
        int ans = 0, shift = 0;
        while (N != 0) {
            int x = (N & 1) ^ 1;
            N >>= 1;
            ans += (x << shift);
            shift++;
        }
        return ans;
    }
}