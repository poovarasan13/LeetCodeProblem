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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     int sum=0,sum2=0;
//     ListNode strat=l1,end=l2;
   
//     // if(l1.next==null && l2.next==null && l2.val!=0 ) return l2;
//     //  if(l1.next==null && l2.next==null && l1.val!=0 ) return l1;
//     while(l1!=null)
//     {
//         sum=sum*10+ l1.val;
//         l1=l1.next;
//     }
//     while(l2!=null)
//     {
//         sum2=sum2*10+ l2.val;
//         l2=l2.next;
//     }
//     ListNode ans=new ListNode(0);
//    ListNode temp=ans;
//     int a=sum+sum2;
//     while(a!=0)
//     {
//         temp.next=new ListNode(a%10);
//         a=a/10;
//         temp=temp.next;

//     }
//     if(ans.next==null)
//     {
//         return ans;
//     }
int sum=0;
ListNode ans=new ListNode(0);
ListNode temp=ans;
  while(l1 != null || l2 != null || sum!=0)
  {
    if(l1!=null)
    {
        sum=sum+l1.val;
        l1=l1.next;
    }
     if(l2!=null)
    {
        sum=sum+l2.val;
        l2=l2.next;
    }
    temp.next=new ListNode(sum%10);
    sum=sum/10;
    temp=temp.next;
  }
    return ans.next;
    }
}