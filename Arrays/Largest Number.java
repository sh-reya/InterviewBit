public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) 
    {
        String stringarr[]=new String[A.length];
        for(int i=0;i<A.length;i++)
        {
            stringarr[i]=String.valueOf(A[i]);
        }
        
        Comparator<String> comp=new Comparator<String>()
        {
            @Override
            public int compare(String str1,String str2)
            {
                String s1=str1+str2;
                String s2=str2+str1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(stringarr,comp);
        if(stringarr[0].charAt(0)=='0')
        {
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        for(String ele:stringarr)
        {
            sb.append(ele);
        }
        return sb.toString();
    }
}
