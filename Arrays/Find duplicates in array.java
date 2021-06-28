public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] a) 
    {
        int n=a.length;
        HashSet<Integer>s=new HashSet<>();
        for(int i=0; i<n; i++)
        {
            if(s.contains(a[i])==false)
            {
                s.add(a[i]);
            }
            else
            {
                return a[i];
            }
        }
        return -1;

    }
}
