class Solution {
    public int longestPalindrome(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int count = 0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                count++;
                i++;
            }
        }
        if(2*count<c.length) return 2*count+1;
        else return 2*count;
    }
}
