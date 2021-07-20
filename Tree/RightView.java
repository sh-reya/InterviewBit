public class Solution 
{
    public ArrayList<Integer> solve(TreeNode A) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        if(A==null)
        {
            return ans;
        }

        Queue<TreeNode>q=new LinkedList<>();
        q.add(A);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0; i<size; i++)
            {
                TreeNode temp=q.poll();
                if(i==size-1)
                {
                    ans.add(temp.val);
                }

                if(temp.left!=null)
                {
                    q.add(temp.left);
                }

                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }


        }

        return ans;
    }
}
