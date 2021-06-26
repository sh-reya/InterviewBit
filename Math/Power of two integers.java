public class Solution 
{
    public int isPower(int A) 
    {
        if(A==1)
        {
            return 1;
        }
        double power;
        for(long i=2; i*i<=A; i++)
        {
            power=Math.log(A)/Math.log(i);
            if(power - (int)(power) <= 0.0000001)
            {
                return 1;
            }
        }
        return 0;

    }
}
