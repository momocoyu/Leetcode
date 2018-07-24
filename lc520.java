class Solution {
    public boolean detectCapitalUse(String word) {
        String s = word.toUpperCase();
        if(s.equals(word))
            return true;
        String q = word.toLowerCase();
        if(q.equals(word))
            return true;
        
        char[] c=word.toCharArray();
        String a = "";
        a+=c[0];
        String d=a.toUpperCase();
        String b="";
        for(int i=1;i<c.length;i++){
            b+=c[i];
        }
        String e=b.toLowerCase();
        return(a.equals(d) && e.equals(b));

    }
}
