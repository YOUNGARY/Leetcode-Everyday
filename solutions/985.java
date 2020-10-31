class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        int[] res = new int[queries.length];
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }
        int idx = 0;
        for (int[] query : queries) {
            if (A[query[1]] % 2 == 0) {
                sum -= A[query[1]];
            }
            if ((query[0] + A[query[1]]) % 2 == 0) {
                sum += query[0] + A[query[1]];
            }
            A[query[1]] += query[0];
            res[idx++] = sum;
        }
        return res;
    }
}