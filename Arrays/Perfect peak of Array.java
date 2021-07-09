public class Solution 
{
    public int perfectPeak(int[] a) 
    {
        int n=a.length;
        int high[]=new int[n];
        int low[]=new int[n];

        high[0]=a[0];

        for(int i=1; i<n; i++)
        {
            if(high[i-1]<a[i])
            {
                high[i]=a[i];
            }
            else
            {
                high[i]=high[i-1];
            }
        }

        low[n-1]=a[n-1];

        for(int i=n-2; i>=0; i--)
        {
            if(low[i+1]>a[i])
            {
                low[i]=a[i];
            }
            else
            {
                low[i]=low[i+1];

            }
        }

       for(int i=1; i<n-1; i++)
       {
           if(a[i]>high[i-1] && a[i]<low[i+1])
           {
               return 1;
           }
       }
       return 0;
    }
}
