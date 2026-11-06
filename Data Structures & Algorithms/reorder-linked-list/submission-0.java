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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        List<Integer> sortedList = new ArrayList<>();
        int l = 0 , r = list.size()-1;
        boolean fromLeft = true;
        while(l <= r) {
            if(fromLeft){
            sortedList.add(list.get(l));
            l++;
            fromLeft = false;
            } 
            else {
sortedList.add(list.get(r));
r--;
fromLeft = true;
            } 
        }
        ListNode temp = head;
        for(int i = 1 ; i < sortedList.size() ; i++) {
            ListNode node = new ListNode(sortedList.get(i));
            temp.next = node;
            temp = temp.next;
        }
        
    }
}
