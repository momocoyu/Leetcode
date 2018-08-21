class Solution {
    public int binaryGap(int N) {
        String s = Integer.toBinaryString(N);
        int distance = 0;
        int d = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(d == -1) d=i;
                else{ 
                    distance = Math.max(distance, (i-d));
                    d=i;
                }
            }
        }
        return distance;
    }
}