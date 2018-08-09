class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        String re="";
        int i = 0;
        for(String ss : temp){
            StringBuilder sb = new StringBuilder(ss);
            re+=sb.reverse().toString();
            i++;
            if(i==temp.length);
            else re+=" ";
        }
        return re;
    }
}
