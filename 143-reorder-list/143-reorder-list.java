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
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode secondHalf = reverse(slow);
        
        reorderList(head, secondHalf, true);
    }
    
    public ListNode reorderList(ListNode head1, ListNode head2, boolean isFirstList){
        if(head1 == null)
            return null;
        if(head2 == null)
            return null;
        
        if(isFirstList){
            head1.next = reorderList(head2, head1.next, false);
            return head1;
        }else{
            head1.next = reorderList(head2, head1.next, true);
            return head1;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}