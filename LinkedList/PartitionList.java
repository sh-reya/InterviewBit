public class Solution 
{
    public ListNode partition(ListNode A, int B) 
    {
        ListNode ss=null,se=null,ls=null,le=null;
        for(ListNode curr=A; curr!=null; curr=curr.next)
        {
            if(curr.val<B)
            {
                if(ss==null)
                {
                    ss=curr;
                    se=ss;
                }

                else
                {
                    se.next=curr;
                    se=se.next;
                }
            }
            else
            {
                if(ls==null)
                {
                    ls=curr;
                    le=ls;
                }

                else
                {
                    le.next=curr;
                    le=le.next;
                }
            }
        }

        if(ss==null || ls==null)
        {
            return A;
        }

        se.next=ls;
        le.next=null;

        return ss;
    }
}
