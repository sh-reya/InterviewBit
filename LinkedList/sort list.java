public class Solution 
{
    public ListNode sortList(ListNode A) 
    {
        ListNode curr=A;
        ListNode temp=A;
        ListNode head=A;
        int count=0;
        while(A!=null)
        {
            count++;
            A=A.next;
        }

        int arr[]=new int[count];
        int index=0;
        while(curr!=null)
        {
            arr[index++]=curr.val;
            curr=curr.next;
        }

        Arrays.sort(arr);

        int i=0;
        while(temp!=null)
        {
            temp.val=arr[i++];
            temp=temp.next;

        }

        return head;


        
    }
}
