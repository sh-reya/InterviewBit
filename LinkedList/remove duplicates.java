public class Solution 
{
    public ListNode deleteDuplicates(ListNode A) 
    {
        
        ListNode temp=A;

        while(A.next!=null)
        {
            if(A.val==A.next.val)
            {
                A.next=A.next.next;
                
            }
            else
            {
                A=A.next;
            }
        }
        return temp;
    }
}
