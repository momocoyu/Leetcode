class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0 ) return 0;
        if( nums.length<3 ) return nums[nums.length - 1];
        int count = 1 ; 
        for(int i = nums.length - 2 ; i>=0 ; i-- ){
            if(nums[i]!=nums[i+1])
                count++;
            if(count == 3)
                return nums[i];
        }
        return nums[nums.length -1];
    }
}
