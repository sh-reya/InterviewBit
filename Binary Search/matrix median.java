public class Solution 
{
    public int findMedian(int[][] a) 
    {
        int r=a.length;
        int c=a[0].length;
        int min=0,max=0;

        for(int i=0; i<r; i++)
        {
             min = Math.min(min, a[i][0]);
             max = Math.max(max, a[i][c-1]);
        }

        int median=(1+r*c)/2;

        while(min<max)
        {
            int mid = min + (max - min)/2;
            int count = 0, newcount = 0;
        
            for(int i=0; i<r; i++)
            {
            
            newcount = Arrays.binarySearch(a[i], mid);
            
            if(newcount < 0)
            {
                newcount = Math.abs(newcount) - 1;
            }
            else
            {
                while(newcount < c && a[i][newcount] == mid)
                    newcount++;
            }
            
            count = count + newcount;
        }
        
        if(count < median)
            min = mid + 1;
        else 
            max = mid;
        }
    
        return min;

        

    }
}
