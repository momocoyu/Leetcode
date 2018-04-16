//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        boolean flag = false;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            flag=false;
            for(int j=0;j<temp.size();j++){
                if(nums[i]==temp.get(j)) {
                    flag=true;
                    break;
                }

            }
            if(flag==false) temp.add(nums[i]);


        }
        for(int i=0;i<temp.size();i++){
            nums[i] = temp.get(i);
        }
        return temp.size();
    }
}
