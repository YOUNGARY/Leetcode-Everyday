class Solution {
    public String removeDuplicates(String S) {
        char[] ch = S.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.getLast() == ch[i]) {
                    stack.removeLast();
                } else {
                    stack.addLast(ch[i]);
                }
            } else {
                stack.addLast(ch[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.reverse().toString();
    }
}