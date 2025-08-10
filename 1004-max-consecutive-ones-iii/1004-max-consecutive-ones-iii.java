class Solution {
    public int longestOnes(int[] nums, int k) {

         int l=0;
         int r=0;
         int maxlen=0;
         int len=0;
         int n= nums.length;
         int zCount=0;

          while(r < n){

            if(nums[r] == 0) zCount++;

           if(zCount > k){

                 if(nums[l] ==0){
                    zCount--;
                    
                 }
                 l++;
             }

             if(zCount <= k){

                len=r-l+1;
                maxlen =Math.max(maxlen,len);
            
             }
             r++;
           
          }
          return maxlen;
        
    }
}