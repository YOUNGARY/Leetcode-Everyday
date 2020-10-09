public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head, second = head.next;
        while (second != null && second.next != null) {
            if (second == first) {
                return true;
            }
            if (second.next != null) {
                first = first.next;
                second = second.next.next;
            }
        }
        return false;
    }
}