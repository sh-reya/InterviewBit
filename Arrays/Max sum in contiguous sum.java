public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] a) 
    {
        int n=a.length;
        int res=a[0];
        int max=a[0];

        for(int i=1; i<n; i++)
        {
            max=Math.max(max+a[i],a[i]);
            res=Math.max(max,res);
        }
        return res;
    }
}
