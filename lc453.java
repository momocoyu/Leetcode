class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            count += nums[i]-nums[0];
        }
         
        return count;
    }
}


// sum = sum of nums before move
// n = length of nums
// m = moves
// min = min num of nums
// x = nums after move

// sum + m*(n-1) = x*n;
// x =min + m  ---- min need to be incresed in each move
// sum + mn- m = min*n+mn
// m=sum-min*n
