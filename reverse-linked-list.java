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
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head; 
        ListNode previousNode = null; 
        ListNode nextNode = null; 
        
        while(current !=null){
            
            //Track the next node after the current to not lose it 
            nextNode = current.next; 
            
            //Make the current point to the previous node 
            current.next = previousNode; 
            
            //Make the new previous the current node 
            previousNode = current; 
            
            //Make the current Node the next node in the linked list that was saved
            current = nextNode; 
        }
        
        return previousNode; 
        
    }
}
