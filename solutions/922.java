class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int even = 0;
        int odd = 1;
        for (int a : A) {
            if (a % 2 == 1) {
                res[odd] = a;
                odd += 2;
            } else {
                res[even] = a;
                even += 2;
            }
        }
        return res;
    }
}