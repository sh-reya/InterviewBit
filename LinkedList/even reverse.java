public class Solution 
{
    public ListNode solve(ListNode A) 
    {
        Stack<Integer>s=new Stack<>();      
        ListNode p1=A;
        int i=1;
        while(p1!=null)
        {
            if(i%2==0)
            {
                s.push(p1.val);
            }
            i++;
            p1=p1.next;
        }

        ListNode p2=A;
        int j=1;
        while(p2!=null)
        {
            if(j%2==0)
            {
                p2.val=s.pop();
            }
            j++;
            p2=p2.next;
        }

        return A;
    }
}
