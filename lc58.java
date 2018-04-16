//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

//If the last word does not exist, return 0.

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        String[] temp=s.split(" ");
        if(temp.length==0) return 0;
        return temp[temp.length-1].length();

    }
}
