public class Solution 
{
    public ListNode reverseList(ListNode a, int k) 
    {
        ListNode curr=a,next=null,prev=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }

        if(next!=null)
        {
            ListNode rest_head=reverseList(next,k);
            a.next=rest_head;
        }
        return prev;
    }
}
