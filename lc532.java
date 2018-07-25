class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int count = 0;
        int temp =-1;
        while(j<nums.length && i<nums.length){
            if((nums[j]-nums[i]==k) ){
                if(temp == -1){
                    temp=i;
                    count++;
                }
                    
                else if(nums[i]!=nums[temp]){
                    temp=i;
                    count++;
                }
                i++;
                j++;
            }
            else if(nums[j]-nums[i]>k){
               
                i++;
                if(i>=j){
                    j++;
                }
            }
            else if(nums[j]-nums[i]<k){
                j++;
            }
                
        }
        return count;
    }
}
