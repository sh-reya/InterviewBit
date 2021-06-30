public class Solution 
{
	public void rotate(ArrayList<ArrayList<Integer>> a) 
    {
        int n=a.size();
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp=a.get(i).get(j);
                int temp2=a.get(j).get(i);
                a.get(i).set(j,temp2);
                a.get(j).set(i,temp);
            }
        }

        for(int i=0; i<n; i++)
        {
            int low=0;
            int high=n-1;
            while(low<high)
            {
                int temp=a.get(i).get(low);
                int temp2=a.get(i).get(high);
                a.get(i).set(low,temp2);
                a.get(i).set(high,temp);

                low++;
                high--;
            }
        }

	}
}
