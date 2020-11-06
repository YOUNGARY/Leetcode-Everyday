class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new LinkedList<>();
        int sum = 0, len = A.length;
        for (int i = 0; i < len; i++) {
            sum = sum * 2 + A[i];
            if (sum % 5 == 0) {
                res.add(true);
            } else {
                res.add(false);
            }
            sum %= 5;
        }
        return res;
    }
}