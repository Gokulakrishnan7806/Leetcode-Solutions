class Solution 
{
    public int searchInsert(int[] nums, int target,int l,int r)
    {
     

        int mid=l+(r-l)/2;
        
         if (l > r) 
         {
            return l;
         }

        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return searchInsert(nums, target, l, mid - 1);
        } else {
            return searchInsert(nums, target, mid + 1, r);
        }
    }


    public int searchInsert(int[] nums, int target)
    {

        return searchInsert(nums,target,0,nums.length-1);
    }





    
}