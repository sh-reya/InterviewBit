public class Solution 
{
    public String solve(String s) 
    {
        
        char str[] = s.toCharArray();
        int n=s.length();
        if(n==1)
        {
            return "-1";
        }
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=s.charAt(i)-'0';
        }

        int i=0;        
        for (i=n-1; i>0; i--)
        {
            if (a[i]>a[i - 1]) {
                break;
            }
        }
        if(i==0)
        {
            return "-1";
        }

        else
        {
            int req=a[i-1];
            int min=i;

            for(int j=i+1; j<n; j++)
            {
                if (a[j]>req && a[j]<a[min])
                {
                    min = j;
                }
            }

            
            int temp=a[i-1];
            a[i-1]=a[min];
            a[min]=temp;

            Arrays.sort(a,i,n);
        }

        StringBuffer ans = new StringBuffer();
        String string_ans="";
        ans.append(a[0]);
        for( i =1;i <n ; i++)
        {
            ans.append(string_ans).append(a[i]);
        }
 
       
        return  ans.toString();

    }
}
