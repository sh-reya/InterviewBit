public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int hammingDistance(final int[] A) 
    {
        long ans=0;
        int n=A.length;
        long mod=1000000007;
        int count[]=new int[32];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<32; j++)
            {
                count[j]+=A[i]&1; 
                A[i]=A[i]/2;

            }
        }

        for(int i=0; i<32; i++)
        {
            ans=((ans+((long)count[i]*(n-count[i])))%mod);
            //ans=(ans%mod);
        }
        return (int)((ans*2)%mod);
        
    }
}
