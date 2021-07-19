public class Solution 
{
    public ArrayList<Integer> inorderTraversal(TreeNode A) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        TreeNode curr=A;
        while(A!=null || !s.isEmpty())
        {
            while(A!=null)
            {
                s.push(A);
                A=A.left;
            }
            A=s.pop();
            ans.add(A.val);
            A=A.right;
        }

        return ans;
    }
}
