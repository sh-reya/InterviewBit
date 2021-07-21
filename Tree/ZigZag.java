public class Solution 
{
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) 
    {
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();

        if(A==null)
        {
            return al;
        }

        s1.push(A);
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            ArrayList<Integer> ans1 = new ArrayList<Integer>();
            ArrayList<Integer> ans2 = new ArrayList<Integer>();
            while(!s1.isEmpty())
            {
                TreeNode temp=s1.pop();
                ans1.add(temp.val);

                if(temp.left!=null)
                {
                    s2.push(temp.left);
                }
                if(temp.right!=null)
                {
                    s2.push(temp.right);
                }
                
            }
            if(!ans1.isEmpty())
            al.add(ans1);
            
            while(!s2.isEmpty())
            {
                TreeNode temp=s2.pop();
                ans2.add(temp.val);

                if(temp.right!=null)
                {
                    s1.push(temp.right);
                }
                
                if(temp.left!=null)
                {
                    s1.push(temp.left);
                }
                 
                
            }
            if(!ans2.isEmpty())
            al.add(ans2);
           
            
        }
       
        return al;
    }
}
