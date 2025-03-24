class Solution {
    public int removeDuplicates(int[] nums) {


        int nextindex=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                nums[nextindex]=nums[i];
                nextindex++;
            }
           
        }
         return nextindex;
        
    }
}