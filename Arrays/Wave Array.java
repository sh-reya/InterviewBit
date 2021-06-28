public class Solution 
{
    public int[] wave(int[] A) 
    {
        Arrays.sort(A);
        int n=A.length;
 
        
        for (int i=0; i<n-1; i=i+2)
        {
            int temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }
        return A;
            
    }
}
