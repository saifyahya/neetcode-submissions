class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int indexFromFront = length - n + 1;

        if (indexFromFront == 1) {
            return head.next;
        }

        ListNode current = head;
        int position = 1;

        while (position < indexFromFront - 1) {
            current = current.next;
            position++;
        }

        current.next = current.next.next;
        return head;
    }

    private int findLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}