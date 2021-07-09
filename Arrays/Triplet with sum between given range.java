public class Solution 
{
    public int solve(String[] A) 
    {
        int n=A.length;
        double a=Double.parseDouble(A[0]);
        double b=Double.parseDouble(A[1]);
        double c=Double.parseDouble(A[2]);

        for(int i=3; i<n; i++)
        {
            if((a+b+c)>1 && (a+b+c)<2)
            {
                return 1;
            }

            else if(a+b+c>=2)
            {
                if(a>b && a>c)
                {
                    a=Double.parseDouble(A[i]);
                }

                else if(b>c && b>a)
                {
                    b=Double.parseDouble(A[i]);
                }

                else 
                {
                    c=Double.parseDouble(A[i]);
                }
            }
            else
            {
                if(a<b && a<c)
                {
                    a=Double.parseDouble(A[i]);

                }

                else if(b<a && b<c)
                {
                    b=Double.parseDouble(A[i]);

                }

                else
                {
                    c=Double.parseDouble(A[i]);

                }
            }
        }

        if((a+b+c)>1 && (a+b+c)<2)
        {
            return 1;
        }

        else
        {
            return 0;
        }
        
    }
}
