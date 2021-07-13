public class Solution 
{
    public ListNode rotateRight(ListNode A, int B) 
    {
        int count=0;
        ListNode temp=A;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
       
        if(B>count)
        {
           B=B%count;
        }

         if(B==0 || count==1)
        {
            return A;
        }

        ListNode point=A;
        int req=count-B;
        for(int i=0; i<req-1; i++)
        {
            point=point.next;

        }

        ListNode end=A;
        for(int i=1; i<count; i++)
        {
            end=end.next;

        }
        ListNode ans=point.next;
        point.next=null;
        end.next=A;
       // A=end;
        return ans;
    }
}
