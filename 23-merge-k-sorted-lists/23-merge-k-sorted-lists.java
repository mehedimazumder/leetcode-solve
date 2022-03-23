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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        return mergeKLists(lists, 0 , lists.length - 1);
    }
    
    public ListNode mergeKLists(ListNode[] lists, int start, int end){
        if(start == end)
            return lists[start];
        else{
            int mid = start + (end - start) / 2;
            ListNode leftPortion = mergeKLists(lists, start, mid);
            ListNode rightPortion = mergeKLists(lists, mid + 1, end);
            return mergeTwoLists(leftPortion, rightPortion);
        }
    }
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        if(l1.val > l2.val){
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }else{
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}








