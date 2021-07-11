public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] a, int x) 
    {
       int n=a.length;
       int low=0,high=n-1;
       while(low<=high)
       {
           int mid=(low+high)/2;
           if(a[mid]==x)
           {
               return mid;
           }

           if(a[low]<a[mid]) //left sorted
           {
               if(x>=a[low] && x<a[mid])
               {
                   high=mid-1;
               }
               else
               {
                   low=mid+1;
               }
           }
           else
           {
               if(a[mid]<x && x<=a[high])
               {
                   low=mid+1;
               }
               else
               {
                   high=mid-1;
               }
           }
       }
       return -1; 

    }
}
