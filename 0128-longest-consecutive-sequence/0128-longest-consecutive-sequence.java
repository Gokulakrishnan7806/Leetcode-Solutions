class Solution {
    public int longestConsecutive(int[] nums) {

        
        int maxlength=1;
        int currentlength=1;
        Arrays.sort(nums);

        if(nums.length==0){
            return 0;
        }

        for(int i=1;i< nums.length;i++){

            if(nums[i]==nums[i-1]){
                continue;
            }
            else if (nums[i]==nums[i-1]+1) {

                currentlength++;
            }
            else{
                maxlength=Math.max(maxlength,currentlength);
                currentlength=1;
            }

        }
        maxlength=Math.max(maxlength,currentlength);
        return maxlength;

        
    }
}