public class Solution 
{
	public int searchInsert(ArrayList<Integer> a, int b) 
    {
        int n=a.size();
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a.get(mid)==b)
            {
                return mid;
            }

            else if(a.get(mid)>b)
            {
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }
        return low;
	}
}
