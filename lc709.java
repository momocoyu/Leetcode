class Solution {
    public String toLowerCase(String str) {
        char[] cc = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : cc){
            if(c>=65 && c<=90)
                c+=32;
            sb.append(c);
        }
        return sb.toString();
    }
}