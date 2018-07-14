class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        for(int i = 0 ; i < ct.length-1;i++){
            if(ct[i]!=cs[i])
                return ct[i];
        }
        return ct[ct.length - 1];
    }
}
