//实则为计算5的个数
//n/5+n/(5*5)+n/(5*5*5)+.....
class Solution {
    public int trailingZeroes(int n) {
        int result=0;
        n=n/5;
        while(n>0){
            result+=n;
            n=n/5;
        }
        return result;
    }
}
