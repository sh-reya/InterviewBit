public class Solution 
{
    public int[] primesum(int n) 
    {
        
        int ans[]=new int[2];
        for(int i=2; i<n; i++)
        {
            if(isPrime(i) && isPrime(n-i))
            {
                ans[0]=i;
                ans[1]=n-i;
                return ans;
            }
        }
        return ans;

    }


    boolean isPrime(int n)
    {
        //if(n==1) return false;
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
