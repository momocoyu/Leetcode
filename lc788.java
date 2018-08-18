class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N ;i++){
            boolean flag = false;
            int t = i;
            
            while(t>0){
                int temp = t % 10;
                if(temp==2 || temp==5 || temp==6 || temp==9 )
                    flag = true;
                
                else if(temp == 3 ||temp==4||temp==7){
                    flag =false;
                    break;
                }
                
                t /= 10;
            }
            
            if(flag)
                count++;
        }
        return count;
    }
}