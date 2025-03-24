class Solution {
    public boolean isPalindrome(int x) {
        int original =x;
        int rem=0;
        int result=0;
        int constant=10;

        if ((x < 0)||(x%10==0) && (x!=0))
        {
            return false;
        }
       
        while(x!=0)
        {
            rem=x%10;
            result=result*constant+rem;
            x=x/10;
        }
     if(result == original){
      return true;  
     }else{
        return false;
     }
    }
}