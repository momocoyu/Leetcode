class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        
        while(x>1){
            x=cal(x);
            
            if(x==1)
                return true;
            
            y=cal(cal(y));
            if(y==1)
                return true;
            if(x==y)
                return false;
        }
        return true;
    }
    
    public int cal(int n){
        int result=0;
        while(n>0){
            result+=(n%10)*(n%10);
            n=n/10;
        }
        return result;
    }
}
