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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode curr1=dummy1;
        ListNode dummy2=new ListNode(0);
        ListNode curr2=dummy2;
        ListNode node=head;
        while(node!=null)
        {
            if(node.val<x)
            {
                curr1.next=node;
                curr1=curr1.next;
            }
            else{
                curr2.next=node;
                curr2=curr2.next;
            }
            node=node.next;
        }
            curr2.next=null;

        curr1.next=dummy2.next;
        return dummy1.next;
        
    }
}