class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int start = 0;
        int end = A.length;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(A[mid] > A[mid+1] && A[mid] > A[mid-1]) return mid;
            else if(A[mid] < A[mid+1]) start = mid;
            else end =mid;
        }
        return -1;
    }
}