class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length;
        List<String> res = new LinkedList<>();
        int idx = 0;
        for (int i = 1; i <= n && idx < len; i++) {
            if (target[idx] == i) {
                res.add("Push");
                idx++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
        }

        return res;
    }
}