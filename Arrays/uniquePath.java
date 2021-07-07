public class Solution 
{
    public int uniquePaths(int A, int B) 
    {
       if(A==1 || B==1)
       {
           return 1;
       } 
       int path1=uniquePaths(A-1,B);
       int path2=uniquePaths(A,B-1);
       return path1+path2;
    }
}
