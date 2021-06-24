public class Solution 
{
    public int titleToNumber(String A) 
    {
        int n=A.length();
        int res=0;
        for(int i=0; i<n; i++)
        {
            res=res*26;
            res=res+(A.charAt(i)-'@');

        }
        return res;

    }
}
