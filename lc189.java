class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i =0 ;i<nums.length;i++){
                temp [i]=nums[i];
        }
        k=k%nums.length;
    
        for(int i =0; i< k ;i++){
            nums[i] =temp[nums.length + i - k ];
        }
        for(int i = k ;i <nums.length; i++){
            nums[i] = temp[i-k];
        }
     
    }
}
