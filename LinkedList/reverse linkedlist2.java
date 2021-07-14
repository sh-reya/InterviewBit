public class Solution 
{
    public ListNode reverseBetween(ListNode A, int B, int C) 
    {
        if(A==null || B==C)
        {
            return A;
        }

        ListNode prev=new ListNode(-1);
        prev.next=A;
        int position=1;
        ListNode start=prev;
        ListNode curr=A;
        while(position<B)
        {
            start=curr;
            curr=curr.next;
            position++;
        }

        ListNode pre=null;
        ListNode end=curr;
        while(position<=C)
        {
            ListNode node=curr.next;
            curr.next=pre;
            pre=curr;
            curr=node;
            position++;

        }

        start.next=pre;
        end.next=curr;

        return prev.next;
    }
}
