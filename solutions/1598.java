class Solution {
    public int minOperations(String[] logs) {
        int cnt = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (cnt > 0) {
                    cnt--;
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}