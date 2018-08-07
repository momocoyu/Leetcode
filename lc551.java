class Solution {
    public boolean checkRecord(String s) {
        int n = 0;
        int f = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'A'){
                f = 0;
                n++;
            }
            else if(c == 'L'){
                f++;
                if(f>2) return false;
            }
            else{
                f = 0;
            }
            if(n>1) return false;
        }
        return true;
    }
}
