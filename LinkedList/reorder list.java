public class Solution 
{
    public ListNode reorderList(ListNode A) 
    {
        if(A==null || A.next==null) return A;
        
        ListNode slow=A;
        ListNode fast =A;
        if(A.next.next==null)
        {
            return A;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp =slow.next;
        Stack<ListNode> st = new Stack<ListNode>();
        st.push(temp);
        while(temp.next!=null)
        {
            temp=temp.next;
            st.push(temp);
        }

        slow.next=null;

        ListNode curr=A, ptr=A.next;
        while(curr!=slow && !st.isEmpty() && ptr!=null)
        {
             curr.next=st.pop();
             curr.next.next=ptr;
             curr=ptr;
             ptr=ptr.next;
        }
       
        return A;

    }
}
