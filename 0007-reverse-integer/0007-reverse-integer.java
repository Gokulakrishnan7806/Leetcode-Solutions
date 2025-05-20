class Solution {
    public int reverse(int x) {

        int rem=0,sum=0,res=0,cons=10;;

     while(x!=0){

         rem=x%10;


         if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            
         res=res*cons+rem;
         x=x/10;
          }
    return res;
        
    }
}