public class Solution 
{
    public int solve(String A) 
    {
        Stack <Character> stack=new Stack<>();
        
        
        for(int i=0;i<A.length();i++)
        {
        if(A.charAt(i)=='{'||A.charAt(i)=='('||A.charAt(i)=='[')
        {
            stack.push(A.charAt(i));
        }
        else if(stack.isEmpty())
        {
            return 0;
        }
        else
        {
            char item=stack.pop();
            if(A.charAt(i)==')'&&item!='(')
            {
                return 0;
            }
            if(A.charAt(i)==']'&&item!='[')
            {
                return 0;
            }
            if(A.charAt(i)=='}'&&item!='{')
            {
                return 0;

            }
        }
        
        
    }
    if(stack.isEmpty())
    {
        return 1;
    }

     else 
     {
        return 0;
    }
    
    }
}
