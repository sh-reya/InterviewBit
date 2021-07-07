public class Solution 
{
    public int divide(int D, int Div) 
    {
        long A=D;
        long B=Div;
        if(B==-1 && A==Integer.MIN_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        int sign=((A<0)^(B<0))?-1:1;
        A=Math.abs(A);
        B=Math.abs(B);
        int q=0;
        while(A>=B)
        {
            A=A-B;
            ++q;
        }
        return q*sign;
    }
}
