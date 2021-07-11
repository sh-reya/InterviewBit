public class Solution 
{
    public ListNode removeNthFromEnd(ListNode A, int B) 
    {
        int count=0;
        for(ListNode i=A; i!=null; i=i.next)
        {
            count++;
        }
        if(B>count || B==count)
        {
            A=A.next;
            return A;
        }

        else
        {
            int req=count-B;
            ListNode prev=null;
            ListNode curr=A;
            for(int i=0; i<req; i++)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next=curr.next;
            return A;


        }
        
    }
}
