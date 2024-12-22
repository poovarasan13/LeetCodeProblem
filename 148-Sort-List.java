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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int len=getLength(temp);
        int [] array=new int[len];
        int i=0;
        while(temp!=null)
        {
            array[i++]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(array);
        temp=head;
        for(i=0;i<len;i++)
        {
            temp.val=array[i];
            temp=temp.next;
        }
        return head;
    }
}