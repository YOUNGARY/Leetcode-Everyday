class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pointer = new ListNode(0);
        pointer.next = head;

        ListNode prev = pointer, cur = head;
        while (cur != null) {
            if (cur.val == val) prev.next = cur.next;
            else prev = cur;
            cur = cur.next;
        }
        return pointer.next;
    }
}