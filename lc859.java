class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        int i=-1;
        int j=-1;
        for(int m=0;m<A.length();m++){
            if(A.charAt(m)!=B.charAt(m))
            {
                if(i==-1){
                    i=m;
                }
                else if(j==-1){
                    j=m;
                }
                else return false;
            }
        }
        if(i!=-1&&j!=-1){
            if(A.charAt(i)==B.charAt(j) && B.charAt(i)==A.charAt(j))
                return true;
        }
        if(!A.equals(B)) return false;
        char[] ca = A.toCharArray();
        for(char e:ca){
            if(A.indexOf(e)!=A.lastIndexOf(e)){
                return true;
            }
        }
        return false;
    }
}