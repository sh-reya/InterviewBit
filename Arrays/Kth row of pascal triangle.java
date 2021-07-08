public class Solution 
{
    public ArrayList<Integer> getRow(int A) 
    {
        ArrayList<ArrayList<Integer>>al=new ArrayList<ArrayList<Integer>>();
        int temp=0;
        for(int i=0; i<A+1; i++)
        {
            al.add(new ArrayList<Integer>());
        }

        

        for(int i=0; i<A+1; i++)
        {
            for(int j=0; j<i+1; j++)
            {
                if(j==0)
                {
                    al.get(i).add(1);
                }

                else
                {
                    if(j<al.get(i-1).size())
                    {
                        temp=al.get(i-1).get(j-1)+al.get(i-1).get(j);
                    }
                    else{
                        temp=al.get(i-1).get(j-1);
                    }
                    al.get(i).add(temp);
                }
            }
        }

        return al.get(A);
    }
}
