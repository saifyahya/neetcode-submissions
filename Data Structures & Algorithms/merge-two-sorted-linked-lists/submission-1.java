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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode();;
        ListNode sortedList = new ListNode();
        temp.next = sortedList;
        while(list1 != null && list2 != null) {
            int val1 = list1.val, val2 = list2.val ;
            if(val1 <= val2) {
                sortedList.next = list1;
                sortedList = list1;
                list1 = list1.next;
            }
            else{
                sortedList.next = list2;
                sortedList = sortedList.next;
                list2 = list2.next; 
            }
        }
        sortedList.next = list1 != null ? list1 : list2;
        return temp.next.next;
    }
}