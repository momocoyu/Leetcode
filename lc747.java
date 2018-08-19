class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int [] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        
        if(temp[temp.length-1] < 2*temp[temp.length-2] )
            return -1;
        else {
            for(int i=0;i<temp.length;i++){
                if(nums[i] == temp[temp.length-1])
                    return i;
            }
        }
        return-1;
    }
}