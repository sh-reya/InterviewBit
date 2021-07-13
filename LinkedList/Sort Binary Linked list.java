public class Solution 
{
    public ListNode solve(ListNode A) 
    {
        ListNode zerostart=null,zeroend=null,onestart=null,oneend=null;
        for(ListNode curr=A; curr!=null; curr=curr.next)
        {
            int x=curr.val;
            if(x==0)
            {
                if(zerostart==null)
                {
                    zerostart=curr;
                    zeroend=zerostart;
                }

                else
                {
                    zeroend.next=curr;
                    zeroend=zeroend.next;
                }
            }

            else
            {
                if(onestart==null)
                {
                    onestart=curr;
                    oneend=onestart;
                }

                else
                {
                    oneend.next=curr;
                    oneend=oneend.next;
                }

            }
        }

        if(zerostart==null || onestart==null)
        {
            return A;
        }

        zeroend.next=onestart;
        oneend.next=null;

        return zerostart;
    }
}
