/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while (head.val == val){
            
            head = head.next;
            if(head==null) return null;
        }
        
        ListNode pre=head;
        ListNode p=head.next;
        
        while(p!=null){
            if(p.val==val){
                pre.next =p.next;
                p=p.next;
            }
            else{
                p=p.next;
                pre=pre.next;
            }
        }
        return head;
        
    }
}
