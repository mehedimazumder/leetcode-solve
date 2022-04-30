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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null)
            return head;
        
        ListNode prev = null;
        ListNode curr_node = head;
        
        for(int i = 1; i < left; i++){
            prev = curr_node;
            curr_node = curr_node.next;
        }
        
        ListNode connection = prev;
        ListNode tail = curr_node;
        
        for(int i = 0; i <= right - left; i++){
            ListNode temp = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = temp;
        }
        
        if(connection != null)
            connection.next = prev;
        else
            head = prev;
        
        tail.next = curr_node;
        return head;
    }
}