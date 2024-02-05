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
   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0); 
        ListNode node = head; 

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                node.next = list1; 
                list1 = list1.next; 

            }else{
                node.next = list2; 
                list2 = list2.next; 
            }

            node = node.next; 
        }

        if(list1 == null){
            node.next = list2; 
        }

        if(list2 == null){
            node.next = list1;
        }

        return head.next; 
    }        
}

// 1. make sure that each list is not null 
// 2. you can parse through a linked list using a while loop 
// 3. if the value of the current list node is smaller than the other list node, set that as the next node for our answer list 
// 4. make sure to parse through the lists, when its node is saved in the answer list, you must advance through the list by moving to the next node 
// 5. edge case: we might finish going through another list before the other 
// 5.5 if the list1 is null, set the rest of the answer list to the remaining of list2 vice-versa 
