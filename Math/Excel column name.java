public class Solution 
{
    public String convertToTitle(int n) 
    {
        
        String str="";
        while(n>=1)
        {
            
            int c=n%26;
            int g=0;
            if(c==0) {c=26;n--;}
            g=c+64;
            
            str=str+(char)(g);
            n=n/26;
        }
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        return sbr.toString();
  
    }
}
