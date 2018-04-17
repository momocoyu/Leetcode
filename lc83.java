//Given a sorted linked list, delete all duplicates such that each element appear only once.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next!=null) {
            while(head.next!=null && head.val==head.next.val){
                head.next=head.next.next;
            }
            head.next = deleteDuplicates(head.next);
        }
        else {
            return head;
        }

        return head;
    }
}
