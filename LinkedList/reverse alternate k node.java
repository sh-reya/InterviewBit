public class Solution 
{
    public ListNode solve(ListNode a, int k) 
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

        if(a!=null)
        {
            a.next=curr;
        }

        count=0;

        while(count<k-1 && curr!=null)
        {
            curr=curr.next;
            count++;
        }

        if(next!=null)
        {
            ListNode rest_head=solve(curr.next,k);
            curr.next=rest_head;
           
        }

        
        return prev;
    }
}
