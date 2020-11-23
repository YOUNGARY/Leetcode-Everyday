class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        int len = nums.length;
        int[] times = new int[len + 1];
        for (int num : nums) {
            times[num]++;
        }
        for (int j = 1; j < len + 1; j++) {
            if (times[j] == 2) {
                res.add(j);
            }
        }
        return res;
    }
}