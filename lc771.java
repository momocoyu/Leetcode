class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] cj = J.toCharArray();
        char[] cs = S.toCharArray();
        int num =0;
        
        for(char cc : cj){
            for(char ccc : cs){
                if(ccc==cc)
                    num++;
            }
        }
        return num;
    }
}