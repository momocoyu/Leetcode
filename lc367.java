class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}

// 完全平方数是奇数的相加！
