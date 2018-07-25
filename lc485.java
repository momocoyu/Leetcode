class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length ==0) return 0;
        int count = 0;
        int countmax = 0;
        for(int i=0;i<nums.length;i++){
 
            if(nums[i]==0) count = 0;
            else count++;
            if(count>countmax){
                countmax =count;
            }
        }

        return countmax;
        
        
    }
}
