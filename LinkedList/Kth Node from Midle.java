public class Solution 
{
    public int solve(ListNode A, int k) 
    {
        ListNode slow=A,fast=A;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode ans=A;
        fast=A;
        for(int i=0; i<k; i++)
        {
            fast=fast.next;
            if(fast==slow.next)
        {
            return -1;
        }
        }

        while(fast!=slow)
        {
            fast=fast.next;
            ans=ans.next;
        }

        
        return ans.val;
    }
}
