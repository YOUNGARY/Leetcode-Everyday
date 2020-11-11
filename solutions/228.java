class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new LinkedList<>();
        }
        List<String> res = new LinkedList<>();
        StringBuilder range = new StringBuilder();
        int last = nums[0];
        range.append(last);
        for (int n : nums) {
            if (n > last + 1) {
                if (Integer.parseInt(range.toString()) != last) {
                    range.append("->").append(last);
                }
                res.add(range.toString());
                range = new StringBuilder();
                range.append(n);
            }
            last = n;
        }
        if (range.length() > 0 && Integer.parseInt(range.toString()) != last) {
            range.append("->").append(last);
        }
        res.add(range.toString());
        return res;
    }
}