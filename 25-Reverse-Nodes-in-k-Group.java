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
    public int getLength(ListNode node)
    {
        int cnt=0;
        while(node!=null)
        {
            node=node.next;
            cnt++;
        }
        return cnt;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,curr=head;
        int len=getLength(temp);
        if(k==1 || head==null ) return head;
        int[] array=new int[len];
        for(int i=0;i<len;i++)
        {
            array[i]=temp.val;
            temp=temp.next;
       
        }
        // k=k%len;
        int a=0,p=0;
        int[] t=new int[len];
        for(int i=0;i<len/k;i++)
        {
             for(int j=k-1;j>=0;j--)
             {
                t[p++]=array[j+a];
             }
             a=a+k;
           
        }
        for(int i=a;i<a+(len%k);i++)
        {
            t[i]=array[i];
        }
         for(int i=0;i<len;i++)
         {
            curr.val=t[i];
            curr=curr.next;
         }

        return head;
    }
}