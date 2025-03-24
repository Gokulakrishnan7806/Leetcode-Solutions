class Solution {
    public int removeElement(int[] nums, int val) {

         int key=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[key]=nums[i];
                key++;
            }
        }
      
        return key;
        
        
    }
}