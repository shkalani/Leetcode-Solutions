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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode preptr = head;
        ListNode ptr = head.next;
        while(ptr!=null){
            if(ptr.val==preptr.val){
                preptr.next = ptr.next;
                ptr = preptr.next;
            }
            else{
            ptr = ptr.next;
            preptr = preptr.next;
            }
        }
        return head;
        
    }
}