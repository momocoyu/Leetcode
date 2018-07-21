class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int result=0;
        for(int i =0;i<s.length();i++){
            char ss=s.charAt(i);
            result=2*result;
            if(ss == '0')
                result+=1;
            if(ss=='1')
                result+=0;
        }
        return result;
    }
}
