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
    public ListNode reverse(ListNode node)
    {
        ListNode prev=null;
        ListNode temp=null;
        ListNode curr=node;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        l1=reverse(l1);
        l2=reverse(l2);
       ListNode ans=new ListNode(0);
       ListNode temp=ans;
       while(l1!=null || l2!=null || sum!=0)
       {
        if(l1!=null)
        {
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null)
        {
            sum+=l2.val;
            l2=l2.next;
        }
        temp.next=new ListNode(sum%10);
        sum=sum/10;
        temp=temp.next;
        
       }
       return reverse(ans.next);
    }
}