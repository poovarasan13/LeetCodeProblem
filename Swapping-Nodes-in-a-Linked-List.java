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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start=head,end=head,temp;
        while(--k>0)
        {
            start=start.next;
        }
        int val=start.val;
        temp=start;
        while(start.next!=null)
        {
            start=start.next;
            end=end.next;
        }
         int a=end.val;
         end.val=val;
         temp.val=a;
        return head;
    }
}