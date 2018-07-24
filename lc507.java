class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1||num==0) return false;
        int n = 1;
        int i = 2;
        
        while(i<=Math.sqrt(num)){
            if((num%i) == 0){
                n += i;
                if(num/i!=i)
                    n+=num/i;
            }
            i++;
            
        }
        
        return (n==num);
        
    }
}
