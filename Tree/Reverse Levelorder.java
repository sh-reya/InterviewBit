public class Solution 
{
    public ArrayList<Integer> solve(TreeNode A) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        Queue<TreeNode>q=new LinkedList<>();

        q.add(A);
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            s.push(temp);

            if(temp.right!=null)
            {
                q.add(temp.right);
            }

            if(temp.left!=null)
            {
                q.add(temp.left);
            }
        }

        while(!s.isEmpty())
        {
            TreeNode res=s.pop();
            ans.add(res.val);
        }

        return ans;
    }
}
