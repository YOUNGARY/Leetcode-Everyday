class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new LinkedList<>();
        int len = A.length;
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int last = K % 10;
            res.add(0, (A[i] + last + carry) % 10);
            K /= 10;
            carry = (A[i] + last + carry) / 10;
        }
        while (carry > 0 || K > 0) {
            int last = K % 10;
            res.add(0, (carry + last) % 10);
            carry = (carry + last) / 10;
            K /= 10;
        }
        return res;
    }
}