/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null||headB == null) return null;
        ListNode p =headA;
        Set<ListNode> NodeSeen = new HashSet<>();
        while(p!=null){
            NodeSeen.add(p);
            p=p.next;
        }
        
        ListNode p2 =headB;
        while(p2!=null){
            if(NodeSeen.contains(p2))
                return p2;
            p2=p2.next;
        }
        return null;
    }
}
