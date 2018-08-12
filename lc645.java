class Solution {
    public int[] findErrorNums(int[] nums) {
        int mis=0;
        int rep=0;
        int count=2;
        Arrays.sort(nums);
        
        if(nums[0]!=1) mis=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(rep!=0 && mis!=0)
                break;
            
            if(nums[i]==nums[i-1] && rep==0){
                rep=nums[i];
                count--;
            }
            if(nums[i]!=count && mis==0)
                mis=count;

            count++;
        }
        if(mis == 0) mis=count;
        int[] re = {rep,mis};
        return re;
    }
}