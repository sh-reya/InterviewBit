public class Solution 
{
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) 
    {
       
        ListNode c1=h1;
        ListNode c2=h2;
        int sum=0,carry=0;
        ListNode s=null,e=null;
        while(c1!=null || c2!=null)
        {
            sum=((c1!=null?c1.val:0)+(c2!=null?c2.val:0))+carry;
            carry=sum/10;
            sum=sum%10;
            
            ListNode ans=new ListNode(sum);
            if(s==null)
            {
                s=ans;
                e=ans;
            }
            else
            {
                e.next=ans;
                e=ans;
            }
            
            if(c1!=null)c1=c1.next;
            if(c2!=null)c2=c2.next;
        }
        if(carry>0)
        {
            e.next=new ListNode(carry);
        }
        return s;
    }
}
