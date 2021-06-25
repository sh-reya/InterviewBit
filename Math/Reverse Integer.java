public class Solution 
{
    public int reverse(int n) 
    {
        int temp=n;
        int prev=0;
        int rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            if((rev-rem)/10!=prev)
            {
                return 0;
            }
            prev=rev;
            n=n/10;
        }
      return rev;
     
    
    }
}
