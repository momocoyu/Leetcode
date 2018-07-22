class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0) 
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        int k=0;
        int[] re = new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                re[k] = nums1[i];
                k++;
                i++;
                j++;
            } 
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[] s = new int[k];
        for(int m=0;m<k;m++){
            s[m] =re[m];
        }
        return s;
    }
}
