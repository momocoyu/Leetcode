class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        
        int res=0;
        int carry=0;
        while(a!=0){
            res = a^b;
            carry = a & b;
            
            a = carry<<1;
            b = res;
        }
        return b;
    }
}
