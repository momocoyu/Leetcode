class Solution {
    public void moveZeroes(int[] nums) {
        int p0=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 & i<p0)
                p0=i;
            else if(nums[i]!=0 & p0<nums.length){
                if(i>p0){
                    int temp;
                    temp=nums[i];
                    nums[i]=0;
                    nums[p0]=temp;
                    int tempi;
                    tempi=p0;
                    p0=i;
                    i=tempi;
                }
            }
        }
    }
}
