class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = head, second = head;
        while (!(second == null || second.next == null)) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}