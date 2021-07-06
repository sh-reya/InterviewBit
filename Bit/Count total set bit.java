public class Solution 
{
    public int solve(int A) 
    {
        int mod=1000000007;
        if(A==0)
        return 0;
        
        long x = (int)(Math.log(A) / Math.log(2));
        long y = (x * (1 << (x-1)) )%mod ;                   
        int z = (A - (1 << x) +1 );                         
                      
        long res =  y+z+solve(z-1);
        
        return (int)res%mod;
    }
}
