public class Solution {
    public int solve(int[] A, int B) {
        int n=A.length;
        int i=0;
        for(i=0;i<n-1;i++)
        {
            if(A[i]>A[i+1])
            break;
        }
        int l=i;
        int y=(bs(A,0,i,B));
        int z=(bs1(A,i+1,n-1,B));
        if(y!=-1) return y;
        if(z!=-1) return z;
        return -1;
        
    }
    int bs(int[] A, int low, int high, int B)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A[mid]==B)
            return mid;

            else if(A[mid]>B)
            high=mid-1;

            else
            low=mid+1;
        }
        return -1;
    }
    int bs1(int[] A, int low, int high, int B)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A[mid]==B)
            return mid;

            else if(A[mid]<B)
            high=mid-1;

            else
            low=mid+1;
        }
        return -1;
    }
}
