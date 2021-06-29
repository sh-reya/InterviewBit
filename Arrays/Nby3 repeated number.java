public class Solution 
{
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) 
    {
        int n=a.size();
        int c1=0,c2=0;
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) 
        {
            if (f==a.get(i))
                c1++;
     
            else if (s==a.get(i))
                c2++;
         
            else if (c1==0) 
            {
                c1++;
                f=a.get(i);
            }
     
            else if (c2 == 0) 
            {
                c2++;
                s=a.get(i);
            }

            else 
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0; i<n; i++)
        {
            if(a.get(i)==f)
            {
                c1++;
            }
            else if(a.get(i)==s)
            {
                c2++;
            }
        }

        if(c1>n/3)
        {
            return f;
        }

        else if(c2>n/3)
        {
            return s;
        }
        else
        {
            return -1;
        }


	}
}
