public class Solution 
{
    public ArrayList<Integer> postorderTraversal(TreeNode A) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();

        if(A==null)
        {
            return ans;
        }

        s1.push(A);

        while(!s1.isEmpty())
        {
            TreeNode temp=s1.pop();
            s2.push(temp);

            if(temp.left!=null)
            {
                s1.push(temp.left);
            }
            if(temp.right!=null)
            {
                s1.push(temp.right);
            }
        }

        while(!s2.isEmpty())
        {
            TreeNode temp=s2.pop();
            ans.add(temp.val);
        }
        
        return ans;

    }
}
