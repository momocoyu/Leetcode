class Solution {
     
    public String licenseKeyFormatting(String S, int K) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))||Character.isDigit(S.charAt(i))){
                stack.push(S.charAt(i));
                count++;
            }
        }
        if(count==0) return "";
        String r="";
        
        if(count==1){
            r+=stack.pop();
            return r.toUpperCase();
        }
        StringBuilder sb= new StringBuilder();
        int j=0;
        for(int i=0;i<count;i++){
            if(j<K){
                sb.append(stack.pop());
                j++;
            }
            else if(j==K)
            {
                sb.append('-');
                j=0;
                i--;

            }
        }
        return sb.reverse().toString().toUpperCase();
    }
}
