class Solution {
    Stack<String> stack = new Stack<>();
    public String reverseVowels(String s) {

        for(int i = 0 ; i<s.length();i++){
            
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
               s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                String temp="";
                temp+=s.charAt(i);
                stack.push(temp);
            }
            
        }
        StringBuilder sb =new StringBuilder(s);
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
               s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                sb.replace(i,i+1,stack.pop());
            }
            
        }
        return sb.toString();
        
    }
}
