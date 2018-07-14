class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1.length==0 || nums2.length==0){
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length+nums2.length];
        for(int i=0;i<result.length;i++){
            result[i]=9999;
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                result[k]=nums1[i];
                k++;
                i++;
                j++;
            }
        }
        int count=0;
        if(result.length==1){
            count=1;
            int[] re1 = new int[1];
            re1[0]=result[0];
            return re1;
        }
        else{
            for(int m = 0;m<k;m++){
                if(result[m]!=result[m+1]){
                    count++;
                }
            }
        }
        int[] re = new int[count];
        int n=0;
        for(int m=0;m<k;m++){
            if(result[m]!=result[m+1]){
                re[n]=result[m];
                n++;
            }
        }
        return re;
    }
}
