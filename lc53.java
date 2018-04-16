//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int maximumAll=nums[0];

        for(int i=0;i<nums.length-1;i++) {
            int temp = nums[i];
            int maximum = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                temp = temp + nums[j];
                if (temp > maximum) maximum = temp;
            }
            if (maximum > maximumAll) {
                maximumAll = maximum;


            }
        }
        if(nums[nums.length-1]>maximumAll){
            maximumAll=nums[nums.length-1];
        }
        return maximumAll;

    }
}
