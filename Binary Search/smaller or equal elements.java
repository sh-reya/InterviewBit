public class Solution 
{
    public int solve(int[] a, int x) 
    {
        int n=a.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]<=x)
            {
                
                
                low=mid+1;
            }

            else
            {
                high=mid-1;
            }
        }
        return low;


    }
}
