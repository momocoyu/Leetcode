class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sr =calString(s);
        int[] tr =calString(t);
        for(int i = 0;i<s.length();i++){
            if(sr[i]!=tr[i])
                return false;
        }
        return true;
       
    }
    public int[] calString(String s){
        int temp=1;
        char c;
        int[] r = new int[s.length()];
        for(int i=0;i<s.length();i++){
            r[i]=0;
        }
        for(int i=0;i<s.length();i++){
            if(r[i]==0){
                c=s.charAt(i);
                r[i]=temp;
                temp++;
                for(int j=i;j<s.length();j++){
                    if(r[j]==0 && s.charAt(j)==c){
                        r[j]=r[i];
                    }
                }
            }
        }
        return r;
    }
}
