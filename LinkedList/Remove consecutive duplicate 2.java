public class Solution 
{
    public ListNode deleteDuplicates(ListNode A) 
    {
        ListNode fake=new ListNode(0);
        fake.next=A;
        ListNode prev=fake;
        ListNode curr=A;

        while(curr!=null)
        {
            while(curr.next!=null && prev.next.val==curr.next.val)
            {
                curr=curr.next;
            }

            if(prev.next==curr)
            {
                prev=prev.next;
            }

            else
            {
                prev.next=curr.next;
            }

            curr=curr.next;
        }
        return fake.next;
        
    }
}
