public class Solution 
{
    public ArrayList<Integer> getRow(int A) 
    {
        ArrayList<Integer>al=new ArrayList<>();
        int num=1;
        al.add(num);
        for(int i=1; i<=A; i++)
        {
            int curr=num*(A-i+1)/i;
            al.add(curr);
            num=curr;
        }
        return al;
    }
