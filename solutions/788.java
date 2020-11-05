class Solution {
    HashMap<Integer, Integer> rotateMap = new HashMap<>();

    public int rotatedDigits(int N) {
        rotateMap.put(2, 5);rotateMap.put(5, 2);rotateMap.put(0, 0);rotateMap.put(1, 1);
        rotateMap.put(8, 8);rotateMap.put(6, 9);rotateMap.put(9, 6);

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (isGoodDigit(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    boolean isGoodDigit(int n) {
        int rotateN = 0, original = n, tens = 1;
        while (n != 0) {
            if (rotateMap.get(n % 10) == null) {
                return false;
            }
            rotateN += rotateMap.get(n % 10) * tens;
            tens *= 10;
            n = n / 10;
        }
        return !(rotateN == original);
    }
}