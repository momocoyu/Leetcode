class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        String[] ss =s.split("\\s+");
        return ss.length;
    }
}
