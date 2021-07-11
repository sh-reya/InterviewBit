public class Solution 
{
    public int sqrt(int a) 
    {
        long low=1,high=a;
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long sqrt=mid*mid;
            if(sqrt==a)
            {
                return (int)mid;
            }

            else if(sqrt>a)
            {
                high=mid-1;
            }

            else
            {
                low=mid+1;
                ans=mid;
            }
        }

        return (int)Math.floor(ans);
    }
}
