class Solution {
    public int findNthDigit(int n) {
        int start =1;
        int len =1;
        long range = 9; 
        while(n>len*range){
            n-=len*range;
            len++;
            range*=10;
            start*=10;
        }
        int target = (n-1)/len + start; 
        String s = Integer.toString(target);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
