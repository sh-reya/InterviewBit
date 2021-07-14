public class Solution 
{
    public int braces(String A) 
    {
        Stack<Character> s=new Stack<>();
        for(int i=0; i<A.length(); i++)
        {
            char c=A.charAt(i);
            if(c=='(' || c=='+' || c=='-' || c=='*' || c=='/')
            {
                s.push(c);
            }
            else if(c==')')
            {
               if(s.peek()=='(')
               {
                   return 1;
               }
               else
               {
                   while(s.peek()!='(' && !s.isEmpty())
                   {
                       s.pop();
                   }
                   s.pop();
               }
                
            }

        
        }
        return 0;


    }
}
