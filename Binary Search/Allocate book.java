public class Solution 
{
    public int books(int[] a, int k) 
    {
        int n=a.length;
        int sum=0,max=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
            max=Math.max(max,a[i]);
        }

        if(n<k)
        {
            return -1;
        }

        int low=max,high=sum,res=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isFeasible(a,n,k,mid))
            {
                res=mid;
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }
        return res;
    }

    public boolean isFeasible(int a[], int n, int k, int ans)
    {
        int req=1,sum=0;
        for(int i=0; i<n; i++)
        {
            if(sum+a[i]>ans)
            {
                req++;
                sum=a[i];
            }

            else
            {
                sum+=a[i];
            }
        }

        return (req<=k);
    }
}
