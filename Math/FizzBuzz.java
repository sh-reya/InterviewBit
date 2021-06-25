public class Solution 
{
    public String[] fizzBuzz(int A) 
    {
        String[] al=new String[A];
        int index=0;
        for(int i=1; i<=A; i++)
        {
            if(i%3==0 && i%5==0)
            {
                al[index++]="FizzBuzz";
            }
            else if(i%5==0)
            {
                al[index++]="Buzz";
               
            }
            else if(i%3==0 )
            {
                al[index++]="Fizz";
                
            }
            else
            {
                al[index++]=String.valueOf(i);
                
            }
        }
        return al;
    }
}
