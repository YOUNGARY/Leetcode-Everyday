class Solution {
    public int minAddToMakeValid(String S) {
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                left.push(c);
            } else if (c == ')') {
                if (!left.isEmpty()) {
                    left.pop();
                } else {
                    right.push(c);
                }
            }
        }
        return left.size() + right.size();
    }
}