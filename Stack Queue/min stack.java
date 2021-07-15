class Solution 
{

    Stack<Integer> min = new Stack<Integer>();
    Stack<Integer> s = new Stack<Integer>();
    
    public void push(int x) 
    {
        s.push(x);    
        if(min.isEmpty() || x <= min.peek())
        {
            min.push(x);
        }
        
    }

    public void pop() 
    {
        if(!s.isEmpty())
        {
            int n = s.pop();
            if(n == min.peek())
            {
                min.pop();
            }
        }
        
    }

    public int top() 
    {
        if(s.isEmpty())
        {
           return -1;
        }
        return s.peek();
        
    }

    public int getMin() 
    { 
        if(min.isEmpty())
        {
            return -1;
        }
        return min.peek();

        
    }
}
