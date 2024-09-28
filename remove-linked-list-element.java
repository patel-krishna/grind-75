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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode newList = head; 
        ListNode current = newList; 
        ListNode prev = null; 
        ListNode next = null; 
        
        while(current != null){
            
            next = current.next; 
            //ListNode nextNext = next.next; 
            
            if(current.val == val){
                prev.next = next; 
            }else{
                prev = current;
            }
            
            current = next; 
            
        }
        
        return newList; 
        
    }
}
