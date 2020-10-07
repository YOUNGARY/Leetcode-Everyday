class Solution {
    public int countPrimeSetBits(int L, int R) {
        boolean[] isPrime = new boolean[21];
        isPrime[2] = true;
        isPrime[3] = true;
        isPrime[5] = true;
        isPrime[7] = true;
        isPrime[11] = true;
        isPrime[13] = true;
        isPrime[17] = true;
        isPrime[19] = true;
        
        int cnt = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime[Integer.bitCount(i)]) {
                cnt++;
            }
        }
        return cnt;
    }
}