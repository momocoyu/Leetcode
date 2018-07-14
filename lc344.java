class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();
        return result;
    }
}
