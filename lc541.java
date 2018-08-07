class Solution {
    public String reverseStr(String s, int k) {
        int i =0;
        String re="";
        while(i < s.length()){
            StringBuilder sb = new StringBuilder("");
            while(i % (2*k)<k){
                if(i>=s.length()) break;
                sb.append(s.charAt(i));
                i++;
            }
            re+=sb.reverse().toString();
            while(i%(2*k)>=k){
                if(i>=s.length()) break;
                re+=s.charAt(i);
                i++;
            }
        }
        return re;
    }
}
