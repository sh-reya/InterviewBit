public class Solution 
{
    public int solve(int A) 
    {
        int count=1;
        int length=1;
        while(count<A)
        {
            length++;
            int element_for_this_length=(1<<(length-1)/2);
            count+=element_for_this_length;
        }

        count-=(1<<(length-1)/2);
        int offset=A-count-1;

        int ans=(1<<(length-1));
        ans|=(offset<<(length/2));

        int val=(ans>>(length/2));
        int rev=reverse(val);

        ans |= rev;
        return ans;
    }

    public int reverse(int A)
    {
        int rev=0;
        while(A!=0)
        {
            int lastbit=(A&1);
            rev|=lastbit;

            rev<<=1;
            A>>=1;
        }
        rev>>=1;
        return rev;
    }
}
