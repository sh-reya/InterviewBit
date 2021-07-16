public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] a) 
    {
        int n=a.length;
        int capacity=0;
        int lmax[]=new int[n+1];
        int rmax[]=new int[n+1];
        
        lmax[0]=a[0];
        for(int i=1; i<n; i++)
        {
            lmax[i]=Math.max(a[i],lmax[i-1]);
        }
        
        rmax[n-1]=a[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rmax[i]=Math.max(a[i],rmax[i+1]);
        }
        
        for(int i=1; i<n-1; i++)
        {
           
            capacity+=Math.min(lmax[i],rmax[i])-a[i];
            
        }
        return capacity;
        

    }
}
