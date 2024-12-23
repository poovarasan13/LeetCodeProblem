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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode start=head,end=head;
        if(k==0) return head;
        if(head==null) return null;
        int cnt=0;
        while(start!=null)

        {
            start=start.next;
            cnt++;
        }
        int a=k%cnt;
        ListNode temp=head;
        for(int i=0;i<a;i++)
        {
            temp=head;
           while(temp.next.next!=null)
           {
            temp=temp.next;
           }
           ListNode curr=temp.next;
           temp.next=null;
           curr.next=head;
          head=curr;

        }
        
        // temp.next;
        return head;
    }
}