public class Solution 
{
    public ArrayList<Integer> solve(TreeNode A) 
    {
        ArrayList<Integer>al=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(A==null)
        {
            return al;
        }
        q.add(A);
        while(!q.isEmpty())
        {
            TreeNode temp=q.remove();
            while(temp!=null)
            {
                al.add(temp.val);
            
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            temp=temp.right;
            }
        }
        return al;
    }
}
