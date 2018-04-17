//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        int[] temp = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n){
            if(nums1[i]>=nums2[j]){
                temp[k]=nums2[j];
                k++;
                j++;
            }
            else {
                temp[k]=nums1[i];
                k++;
                i++;
            }
        }
        if(i<m){
            while (i<m){
                temp[k]=nums1[i];
                i++;
                k++;
            }
        }
       if(j<n) {
            while (j<n){
                temp[k]=nums2[j];
                j++;
                k++;
            }
        }
        for(int l=0;l<m+n;l++){
            nums1[l]=temp[l];
        }
    }
}
