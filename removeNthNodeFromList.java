/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode l1 = head;
        while(l1.next != null){
            size++;
            l1 = l1.next;
        }
        size++;
        int t1 = (size - n) + 1;
        return deleteNode(head, t1);
        
    }
    
    private ListNode deleteNode(ListNode l2, int t1) {
        ListNode temp = l2;
        if (t1 == 1)
        {
            return temp.next;
        }
        for(int i=1; temp != null && i<t1-1; i++){
            temp = temp.next;
        }
        ListNode next = temp.next.next;
        temp.next = next;
        return l2;
    }
}
