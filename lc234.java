/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode middle = getMiddle(head);
        ListNode reverse = reverseList(middle);
        return compare(head, reverse);
    }
    
    public ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        while(current!= null){
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }
    
    public boolean compare(ListNode l1, ListNode l2){
        while(l2!=null){
            if(l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}