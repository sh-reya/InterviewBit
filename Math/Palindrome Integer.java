int isPalindrome(int n) 
{
    int temp=n;
    int rev=0;
    if(n<0)
    {
        return 0;
    }
    while(n!=0)
    {
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(rev==temp)
    {
        return 1;
    }
    else
    {
        return 0;
    }
    
}
