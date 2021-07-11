public class Solution 
{
    public int lPalin(ListNode A) 
    {
        if(A==null)
        {
            return 1;
        }

        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode rev=reverse(slow.next);
        ListNode curr=A;

        while(rev!=null)
        {
            if(rev.val!=curr.val)
            {
                return 0;
            }
            rev=rev.next;
            curr=curr.next;
        }
        return 1;
    }

    ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
}
