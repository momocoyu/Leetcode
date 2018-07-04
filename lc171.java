class Solution {
    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int result=0;
        for(int i=0;i<c.length;i++){
            result = result * 26;
            result += c[i] - 'A' + 1;

        }
        return result;

    }
}
