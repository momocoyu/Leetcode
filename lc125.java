class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))|| Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        String s1 = sb.toString().toLowerCase();
        String s2 =sb.reverse().toString().toLowerCase();

        if(s1.equals(s2))
            return true;
        else return false;

        
    }
}
