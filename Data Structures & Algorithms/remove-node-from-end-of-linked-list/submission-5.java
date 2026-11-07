/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

List<Integer> list = new ArrayList<>();
ListNode current = head;
while(current != null){
    list.add(current.val);
    current= current.next;
}
list.remove(list.size()-n);
if(list.isEmpty()) return null;
ListNode temp  = new ListNode(list.get(0));
ListNode header = temp;
for(int i = 1 ; i < list.size() ; i++){
    ListNode node = new ListNode(list.get(i));
    temp.next = node;
    temp = node;
}
return header;
    }
}
