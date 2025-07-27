class Solution {
    public int majorityElement(int[] nums) {

        int n=nums.length;

        Arrays.sort(nums);

        int ans  = nums[n/2];

        return ans;
        
    }
}