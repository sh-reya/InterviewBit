public class Solution 
{
    public ArrayList<Integer> preorderTraversal(TreeNode A) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        if(A==null)
        {
            return ans;
        }
        s.push(A);
        while(!s.isEmpty())
        {
            A=s.pop();
            ans.add(A.val);
            if(A.right!=null)
            {
                s.push(A.right);
            }
            if(A.left!=null)
            {
                s.push(A.left);
            }
        }
        return ans;
    }
}
